package week5.day1.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LauchBrowser {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        String text=driver.findElement(By.tagName("h2")).getText();
        System.out.println(text);
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.partialLinkText("Create")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Monisha");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Tester");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Completed Manual Testing and Pursuing Automation Testing");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("monisha07122001@gmail.com");
        WebElement StateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select StateDropDown = new Select(StateDD);
        StateDropDown.selectByVisibleText("Indiana");
        driver.findElement(By.name("submitButton")).click();
        String text1="View Lead | opentaps CRM";
        String text2=driver.getTitle();
        if(text1.equals(text2)) {
        	System.out.println("Matches");
        }
        else {
        	System.out.println("Error");
        }
        
	}

}
