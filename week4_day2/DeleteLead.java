package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Home Assignment <2>: Delete Lead
public class DeleteLead {

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
		//enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the "Leads" link
		driver.findElement(By.linkText("Leads")).click();
		//Click "Find leads."
		driver.findElement(By.linkText("Find Leads")).click();
		//Click on the "Phone" tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter the phone number
		driver.findElement(By.name("phoneAreaCode")).sendKeys("2");
		driver.findElement(By.name("phoneNumber")).sendKeys("987654321");
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//Capture the lead ID of the first resulting lead.
		String textLead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(textLead);
		//Click the first resulting lead
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		//Click the "Delete" button
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		Thread.sleep(2000);
		//Click "Find leads" again.
		driver.findElement(By.linkText("Find Leads")).click();
		//Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneAreaCode")).sendKeys("2");
		driver.findElement(By.name("phoneNumber")).sendKeys("987654321");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text);
		//Close the browser.
		driver.close();

	}

}
