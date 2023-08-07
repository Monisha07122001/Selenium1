package week5.day1.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
public static void main(String[] args) {
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
    driver.findElement(By.linkText("Contacts")).click();
    driver.findElement(By.linkText("Create Contact")).click();
    driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Monisha07");
    driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("N");
    driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Moni");
    driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Bommi");
    driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("ECE");
    driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("I am currently undergoing a training as software testing");
    driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("monisha07122001@gmail.com");
    WebElement text3=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
    Select text1=new Select(text3);
    text1.selectByVisibleText("New York");
    driver.findElement(By.className("smallSubmit")).click();
    driver.findElement(By.xpath("//a[text()='Edit']")).click();
    driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).clear();
    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Currently completed Manual Testing");
    driver.findElement(By.xpath("//input[@class='smallSubmit'])[1]")).click();
    String title=driver.getTitle();
    System.out.println("Title: "+title);
    
    
}
}
