package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		//Enter the CompanyName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("testLeaf");
		//Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("selenium98");
		//Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("tester98");
		//Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("localFirstName98");
		//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("student");
		//Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("testing desc");
		//Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("test98@gmail.com");
		//Select State/Province as NewYork Using Visible Text.
		WebElement dropdownList = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select options1=new Select(dropdownList);
		options1.selectByVisibleText("New York");
		//Click on the Create Button.
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//Click on the edit button.
		driver.findElement(By.linkText("Edit")).click();
		//Clear the Description Field.
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//Fill the Important Note Field with Any text.
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("notes");
		//Click on the update button
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		//Get the Title of the Resulting Page.
		System.out.println(driver.getTitle());
		//Close the browser window
		driver.close();

	}

}
