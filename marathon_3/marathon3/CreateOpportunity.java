package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateOpportunity extends BaseClass{

	@BeforeTest
	public void setValues()
	{
		filename="CreateOpportunity";
	}
	
	@Test(dataProvider="fetch")
	 public void createOpportunity(String name, String amount) throws InterruptedException {
		 	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	       
	        
	        //Click on the "New" button.
	        driver.findElement(By.xpath("//div[text()='New']")).click(); 
	        
	        //Enter the Opportunity name as 'Salesforce Automation by Your Name.
	        //String name="marathon3Test";
	        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	        
	        //Enter Amount as 75,000
	        driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);
	        
	        //Choose the close date as Today.
	        driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	        driver.findElement(By.xpath("//td[@class='slds-is-today']")).click();
	        
	        //Select 'Stage' as 'Need Analysis'
	        driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input')])[2]")).click();
	        driver.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Needs Analysis']")).click();
	        
	        //Click on the 'Save' button and verify the Opportunity Name.
	        driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	        String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	        System.out.println(toastMessage);
	        Assert.assertTrue(toastMessage.contains(name),"Verify the Account name");
			
	    }
}
