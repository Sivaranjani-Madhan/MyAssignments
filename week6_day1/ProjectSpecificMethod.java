package week6.day1;
//Home Assignment <Day2.1>: Demonstrating Static Parameterization in TestNG
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class ProjectSpecificMethod {

	//launch browser
	public ChromeDriver driver;
	//ensure the availability of URL, username, and password as parameters to set up pre-test conditions.
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url,String username,String password) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		//get URL
		driver.get(url);
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter username, password and login
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();	
		Thread.sleep(5000);
	}

	@AfterMethod
	public void postCondition()
	{
		driver.close(); 
	}

}
