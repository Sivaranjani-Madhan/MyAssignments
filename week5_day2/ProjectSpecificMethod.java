package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//Home Assignment <3>: Optimizing Test Case Structure with Annotations in TestNG
public class ProjectSpecificMethod {

	//launch browser
	public ChromeDriver driver;
	//ensure the availability of URL, username, and password as parameters to set up pre-test conditions.
	@BeforeMethod
	public void preCondition() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		//get URL
		driver.get("https://login.salesforce.com/");
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter username, password and login
		driver.findElement(By.id("username")).sendKeys("bhuvanesh.moorthy@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@2025");
		driver.findElement(By.id("Login")).click();	
		Thread.sleep(5000);
	}

	@AfterMethod
	public void postCondition()
	{
		driver.close(); 
	}

}
