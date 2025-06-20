package week4.day2;

//Home Assignment : Window Handling and Interaction Automation

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initialize the WebDriver (ChromeDriver).
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		//load the URL
		driver.get("http://leaftaps.com/opentaps/");
		//maximize the window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parentWindow = driver.getWindowHandle();
		//enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the Contacts button
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();
		// Click on the widget of the "From Contact".
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		Thread.sleep(2000);
		//getWindowHandles
		Set<String> allWindows = driver.getWindowHandles();
		List<String> windows=new ArrayList<String>(allWindows);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(2000);
		//Click on the first resulting contact.
		driver.findElement(By.linkText("13100")).click();
		//Switch back to the old tab or window
		driver.switchTo().window(windows.get(0));
		Thread.sleep(2000);
		//Click on the widget of the "To Contact"
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		Thread.sleep(2000);
		//getWindowHandles
		Set<String> allWindows1 = driver.getWindowHandles();
		List<String> windows1=new ArrayList<String>(allWindows1);
		driver.switchTo().window(windows1.get(1));
		Thread.sleep(2000);
		//Click on the first resulting contact.
		driver.findElement(By.linkText("13100")).click();
		Thread.sleep(2000);
		//Switch back to the old tab or window
		driver.switchTo().window(windows1.get(0));
		//Click on the Merge button.
		driver.findElement(By.linkText("Merge")).click();
		//Accept the alert.
		Alert confirmationAlert = driver.switchTo().alert();
		confirmationAlert.accept();
		//Verify the title of the page
		System.out.println(driver.getTitle());

	}

}
