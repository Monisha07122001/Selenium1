package week5.day1.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//label[@class='form-check-label']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String text="ACME System 1 - Dashboard";
		String text1=driver.getTitle();
		if(text.equals(text1)) {
			System.out.println("Matches");
		}
		else {
			System.out.println("Not Matches");
		}
		
		
	}

}
