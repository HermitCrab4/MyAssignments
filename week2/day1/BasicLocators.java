package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BasicLocators {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println("Login Confirmation: "+title);
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gandeeswar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		WebElement DD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(DD);
		//sec.selectByIndex(5);
		//sec.selectByValue("LEAD_EMPLOYEE");
		sec.selectByVisibleText("Word of Mouth");
		Thread.sleep(3000);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);

	}

}
