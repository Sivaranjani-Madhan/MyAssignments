package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize the WebDriver (ChromeDriver).
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		//load the URL
        driver.get("http://leaftaps.com/opentaps/control/main");
		
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
		
		//Click on the "Leads" tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("fname1");
		
		//Enter a LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lname1");
		
		//Enter a CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf1");
		
		//Enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("test1");
		String title=driver.findElement(By.id("createLeadForm_generalProfTitle")).getAttribute("value");
		//System.out.println(title);
		
		//Click the "Create Lead" button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verify that the Title is displayed correctly
		String titleValue=driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		if(titleValue.contains(title))
			System.out.println(titleValue+ " Title is displayed correctly.");
		else
			System.out.println(titleValue+ " Title is not displayed correctly.");
		
		//Close the browser window
		driver.close();
		
	}

}
