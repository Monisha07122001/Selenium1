package week5.day1.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
	public static void main(String[] args) {
		//Launching the chrome
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximizes the window
		driver.manage().window().maximize();
		//enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter password
	    driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	    //click the login button
        driver.findElement(By.className("decorativeSubmit")).click();
        //Check whether we are the page is correct using the text over there and print it
        String text=driver.findElement(By.tagName("h2")).getText();
        System.out.println(text);
        //click crm/sfa button
        driver.findElement(By.linkText("CRM/SFA")).click();
        //click leads
        driver.findElement(By.linkText("Leads")).click();
        //create leads 
        driver.findElement(By.partialLinkText("Create")).click();
        //enter the company name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        //enter the first name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Monisha");
        //enter the last name
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
        //enter the departmentname
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Tester");
        //enter the description
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Completed Manual Testing and Pursuing Automation Testing");
        //enter the email id
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("monisha07122001@gmail.com");
        //select the state using drop down with the help of Select keyword
        WebElement StateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        //create an object to select the state
        Select StateDropDown = new Select(StateDD);
        StateDropDown.selectByVisibleText("Indiana");
        //click submit button
        driver.findElement(By.name("submitButton")).click();
        //check the current page visible is right by comparing
        String text1="View Lead | opentaps CRM";
        String text2=driver.getTitle();
        if(text1.equals(text2)) {
        	System.out.println("Matches");
        }
        else {
        	System.out.println("Error");
        }
        //to create duplicate account click duplicate account
        driver.findElement(By.className("subMenuButton")).click();
        //clear the account using clear keyword
        driver.findElement(By.id("createLeadForm_companyName")).clear();
        //enter another new input in company name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf1");
        //clear the first name
        driver.findElement(By.id("createLeadForm_firstName")).clear();
        //enter the new first name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MONI");
        //click submit button
        driver.findElement(By.className("smallSubmit")).click();
        //check the viewed page matches 
        String text3="View Lead | opentaps CRM";
        String text4=driver.getTitle();
        if(text3.equals(text4)) {
        	System.out.println("Matching");
        }
        else {
        	System.out.println("Error occurs");
        }
        
        
        
	}

}
