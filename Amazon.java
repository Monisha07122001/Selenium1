package week5.day1.program1;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Amazon {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
	driver.findElement(By.xpath("//span[text()=' for boys']")).click();
	WebElement text=driver.findElement(By.xpath("//span[text()='1-48 of over 50,000 results for']"));
	text.click();
	String text2=text.getText();
	WebElement text3=driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
	text3.click();
	String text4=text3.getText();
	System.out.print("Total number of items: " +text2+ " " +text4);
	System.out.println();
	driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
	driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
	driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
	driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	WebElement brandname=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]"));
	brandname.click();
	String brand=brandname.getText();
	System.out.println("brand name: "+brand);
	WebElement discount=driver.findElement(By.xpath("(//span[text()='(29% off)'])[1]"));
	discount.click();
	String discountValue=discount.getText();
	System.out.println("discount Value: "+discountValue);
	String title=driver.getTitle();
	System.out.println("Title: "+title);
	driver.close();
}
}
