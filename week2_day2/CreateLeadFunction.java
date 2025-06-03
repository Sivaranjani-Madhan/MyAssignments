package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        EdgeDriver  driver=new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//Enter the username
		
		//Find the element findElement()
		
		//Enter the value in text field  sendKeys
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//by relative path
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		//Enter the password
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on the login button
		
		driver.findElement(By.className("decorativeSubmit")).click();

		//click the CRM/SFA
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on the leads
		
		driver.findElement(By.linkText("Leads")).click();
		
		//click on the create lead
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the company name
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
	    //Enter the firstname
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivaranjan");
		
		//step 1: find the element
		
		WebElement sourcedropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//step 2: create an object select
		
		Select dropDown=new Select(sourcedropDown);
		
		//step 3: Use the method to select the options
		
		//select by index
		dropDown.selectByIndex(3);
		
		//select by value
		dropDown.selectByValue("LEAD_DIRECTMAIL");
		
		//select by text
		dropDown.selectByVisibleText("Direct Mail");
		
		
		
	}

}
