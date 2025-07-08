package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DeleteOpportunity extends BaseClass{
	
	@BeforeTest
	public void setValues()
	{
		filename="CreateOpportunity";
	}

	@Test(dataProvider="fetch", dependsOnMethods = {"createOpportunity", "editOpportunity"})
	public  void deleteOpportunity(String name,String amount) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Search for the Opportunity 'Salesforce Automation by Your Name'.
		driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(name+ Keys.ENTER);
		Thread.sleep(2000);

		//Click on the Dropdown icon and select 'Delete'.
		WebElement dropdown = driver.findElement(By.xpath("//span[text()='"+name+"']/following::button[contains(@class,'slds-button')]/span[text()='Show Actions']"));
		driver.executeScript("arguments[0].click();", dropdown);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();

		//Verify whether the Opportunity is deleted using the Opportunity Name
		String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(toastMessage);
		Assert.assertTrue(toastMessage.contains(name),"Verify the Opporunity name");
		

	}
}
