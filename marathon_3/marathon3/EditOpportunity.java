package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditOpportunity extends BaseClass {
	
	@BeforeTest
	public void setValues()
	{
		filename="CreateOpportunity";
	}

	@Test(dataProvider="fetch" , dependsOnMethods = {"createOpportunity"})
	public void editOpportunity(String name,String amount) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Search for the Opportunity 'Salesforce Automation by Your Name'.
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(name,Keys.ENTER);
		Thread.sleep(1000);

		//Click on the Dropdown icon and select 'Edit'
		WebElement dropdown = driver.findElement(By.xpath("//span[text()='"+name+"']/following::button[contains(@class,'slds-button')]/span[text()='Show Actions']"));
		driver.executeScript("arguments[0].click();", dropdown);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();

		//Choose the close date as Tomorrow's date.
		//driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//label[text()='Close Date']/following-sibling::div/input")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//td[@class='slds-is-today']/td")).click();
		driver.findElement(By.xpath("(//td[contains(@class,'slds-is-today')]/ancestor::tr/following-sibling::tr/td)[1]")).click();
		//WebElement date = driver.findElement(By.xpath("//td[@class='slds-is-today']/following-sibling::td"));
		//driver.executeScript("arguments[0].click();", date);
		
		
		//Select 'Stage' as 'Perception Analysis'.
        driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input')])[3]")).click();
        driver.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Perception Analysis']")).click();

        //Select 'Delivery/Installation Status' as 'In Progress'.
        Actions act=new Actions(driver);
        WebElement scrollStatus = driver.findElement(By.xpath("//label[text()='Delivery/Installation Status']/following::button"));
        driver.executeScript("arguments[0].click();", scrollStatus);
        act.scrollToElement(scrollStatus).click();
        //scrollStatus.click();
        driver.findElement(By.xpath("//span[text()='In progress']")).click();
        
        //Enter Description as 'SalesForce'
        driver.findElement(By.xpath("//label[text()='Description']/following::textarea")).sendKeys("Salesforce");
        
        //.Click on 'Save' and verify the Stage as 'Perception Analysis'.
        driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
        Thread.sleep(1000);
        String stageValue = driver.findElement(By.xpath("//span[@title='Perception Analysis']")).getText();
        System.out.println(stageValue);
        Assert.assertTrue(stageValue.contains("Perception Analysis"),"Verify the stage name");

	}



}
