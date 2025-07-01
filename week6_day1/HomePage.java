package week6.day1;
//Home Assignment <Day2.2>: Demonstrating Dynamic Parameterization in TestNG
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePage extends ProjectSpecificMethod {
	
	@DataProvider(name="fetchData")
	public String[][] setData()
	{
	String data[][]=new String[1][2];
	data[0][0]="Salesforce Automation by Sivaranjani";
	data[0][1]="demo salesforce";
	return data;
	
	}
	
	
	@Test(dataProvider="fetchData")
	public void homePage(String companyName,String description) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//Click View All and click Legal Entities from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(5000);	
		Actions act=new Actions(driver);	
		WebElement scrollEle = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		act.scrollToElement(scrollEle).perform();		
		scrollEle.click();
		//Click on the Dropdown icon in the legal Entities tab
		driver.findElement(By.xpath("(//div[contains(@class,'slds-context-bar__label-action')])[10]")).click();
		//Click on New Legal Entity
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(2000);
		//Enter the Company name as 'TestLeaf
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(companyName);
		//Enter Description as 'Salesforces'. 
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys(description);
		//Select Status as 'Active'
		WebElement scrollEle3 = driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input')]"));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", scrollEle3);
		//WebElement scrollEle3 = driver.findElement(By.xpath("//label[text()='Status']"));
	    //act.scrollToElement(scrollEle3).perform();
		//scrollEle3.click();
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		//Click on Save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//Verify the Alert message (Complete this field) displayed for Name
		driver.findElement(By.xpath("//a[text()='Legal Entity Name']")).click();
		String text = driver.findElement(By.xpath("(//div[contains(@class,'slds-form-element__help')])[2]")).getText();
		System.out.println("Alert message is: "+text);
		
		
	}

}
