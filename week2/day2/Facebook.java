package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hermit");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Crab");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("hermitcrab4@gmail.com"); 
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("hermitcrab4@gmail.com"); 
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("HermitCrab4");  
		
		
		WebElement sday = driver.findElement(By.id("day"));
		Select day = new Select(sday);
		day.selectByIndex(27); 
		
		WebElement smonth = driver.findElement(By.id("month"));
		Select month = new Select(smonth);
		month.selectByIndex(4);
		
		WebElement syear = driver.findElement(By.id("year"));
		Select year = new Select(syear);
		year.selectByValue("1993");
		
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		driver.findElement(By.name("websubmit")).click();
	
		
		
		
		

		
	}

}
