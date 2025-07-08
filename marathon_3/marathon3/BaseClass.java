package marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class BaseClass {

	public ChromeDriver driver;
	public String filename;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preConditions(String url,String username,String password) throws InterruptedException
	{
		//Launch the browser.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//load the URL
		driver.get(url);
		//login
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		//Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
		Thread.sleep(2000);
		//Click on the "Opportunity" tab.
		WebElement oppurtunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", oppurtunity);
	}
	
	@AfterMethod
	public void postConditions() {
		driver.close();

	}
	
	@DataProvider(name="fetch")
	public String[][] setDatas() throws IOException
	{
		String[][] readData = ReadExcel.readData(filename);
		  return readData;
	}
}
