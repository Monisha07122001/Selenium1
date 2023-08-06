package week5.day1.program1;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.abhibus.com/");
	driver.findElement(By.xpath("(//a[text()='Bus'])[2]")).click();
	driver.findElement(By.id("source")).sendKeys("Chennai");
	driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	driver.findElement(By.id("destination")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	driver.findElement(By.id("datepicker1")).click();
	driver.findElement(By.xpath("//a[text()='7']")).click();
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	WebElement name=driver.findElement(By.xpath("//h2[@title='Yolo Bus']"));
	name.click();
	String name1=name.getText();
	System.out.println("name of the first bus: "+name1);
	driver.findElement(By.xpath("(//input[@name='Bustypes'])[4]")).click();
	WebElement name2=driver.findElement(By.xpath("//p[text()='24 Seats Available']"));
	name2.click();
	String name3=name2.getText();
	System.out.println("Seat number: " +name3);
	driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
	driver.findElement(By.xpath("//a[@class='pillow']")).click();
	WebElement seat=driver.findElement(By.xpath("//span[@id='seatnos']"));
	seat.click();
	String name5=seat.getText();
	System.out.println("Seat number: "+name5);
	WebElement fare=driver.findElement(By.xpath("//span[@id='ticketfare']"));
	fare.click();
	String name6=fare.getText();
	System.out.println("fare amount: "+name6);
	WebElement Bordingpp=driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));
	Select BB=new Select(Bordingpp);
	BB.selectByVisibleText("//option[text()='Saidapet-22:38']");
	WebElement Dropingpp=driver.findElement(By.id("droppingpoint_id"));
	Select Dd=new Select(Dropingpp);
	Dd.selectByVisibleText("Electronic City Toll Gate-05:07");
	String title=driver.getTitle();
	System.out.println("Title: "+title);
	driver.close();
	
	
	
}
}
