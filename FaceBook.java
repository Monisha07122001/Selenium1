package week5.day1.program1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;




public class FaceBook {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Monisha");
		driver.findElement(By.name("lastname")).sendKeys("N");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("monisha07122001@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("monisha07122001@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Bommi07122001@");
		WebElement datedd=driver.findElement(By.xpath("//select[@title='Day']"));
		Select datedropdown=new Select(datedd);
		datedropdown.selectByValue("7");
		WebElement datedd1=driver.findElement(By.name("birthday_month"));
		Select datedropdown1=new Select(datedd1);
		datedropdown1.selectByVisibleText("Dec");
		WebElement datedd2=driver.findElement(By.xpath("//select[@id='year']"));
		Select datedropdown2=new Select(datedd2);
		datedropdown2.selectByValue("2001");
		//driver.findElement(By.partialLinkText("Female")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.name("websubmit")).click();
		}
	}


