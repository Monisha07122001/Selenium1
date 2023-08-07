package week5.day1.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {
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
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        driver.findElement(By.linkText("Phone")).click();
        //driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("+91");
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7397232614");
        //driver.findElement(By.linkText("Email")).click();
        //driver.findElement(By.name("emailAddress")).sendKeys("monisha07122001@gmail.com");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        //driver.findElement(By.xpath("//a[text()='10728']"));
        driver.findElement(By.linkText("Lead ID")).click();
        driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
        driver.findElement(By.linkText("Delete")).click();
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        String text1="No records to display";
        String text2=driver.getTitle();
        if(text1.equals(text2)) {
        	System.out.println("Matches");
        }
        else {
        	System.out.println("Not matches");
        }

  
        
      
        
        
	}

}
