package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch the browser as guest
		ChromeOptions option =new ChromeOptions();
		option.addArguments("guest");

		ChromeDriver driver =new ChromeDriver(option);
		
		//ChromeDriver driver=new ChromeDriver();
		//EdgeDriver  driver=new EdgeDriver();
		
		//load the url
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
		
		//Click on the "Accounts" tab.
		 driver.findElement(By.linkText("Accounts")).click();
		 
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("salesmanger99");
		String accountnameVaue=driver.findElement(By.id("accountName")).getAttribute("value");
		//System.out.println(accountnameVaue);
		
		//Enter a description as "Selenium Automation Tester
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		//Select "ComputerSoftware" as the industry
        WebElement sourcedropDown = driver.findElement(By.name("industryEnumId"));
		
		//step 2: create an object select
		Select dropDown=new Select(sourcedropDown);
		
		//step 3: Use the method to select the options
		//select by index
		dropDown.selectByIndex(3);
		
		//Select "S-Corporation" as ownership using SelectByVisibleText
        WebElement sourcedropDown1 = driver.findElement(By.name("ownershipEnumId"));
        
        //step 2: create an object select
      	Select dropDown1=new Select(sourcedropDown1);
      		
      	//step 3: Use the method to select the options
      	//select by VisibleText
      	dropDown1.selectByVisibleText("S-Corporation");

		//step1: Select "Employee" as the source using SelectByValue
      	WebElement sourcedropDown2 = driver.findElement(By.id("dataSourceId"));
      	
      	//step2: create an object
      	Select dropDown2=new Select(sourcedropDown2);
      	
      	//step3: SelectByValue
      	dropDown2.selectByValue("LEAD_EMPLOYEE");
      	
      	//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
      	WebElement sourcedropDown3 = driver.findElement(By.id("marketingCampaignId"));
      	
      	//step2: create an object select
      	Select dropDown3= new Select(sourcedropDown3);
      	
      	//step3: SelectByIndex
      	dropDown3.selectByIndex(6);
      	
      	//Select "Texas" as the state/province using SelectByValue
      	WebElement sourcedropDown4 = driver.findElement(By.id("generalStateProvinceGeoId"));
      	
      	//step2: create an object select
      	Select dropDown4=new Select(sourcedropDown4);
      	
      	//step3: SelectByValue
      	dropDown4.selectByValue("TX");
      	
      	//Click the "Create Account" button
      	driver.findElement(By.className("smallSubmit")).click();
      	
      	//Verify that the account name is displayed correctly
      	String accountValue =driver.findElement(By.xpath("//span[@class='tabletext']")).getText();
      	//System.out.println("accountName is: " +accountValue);
      	if(accountValue.contains(accountnameVaue))
      		System.out.println("accountName is displayed correctly");
      	else
      		System.out.println(accountValue+ " accountName is not displayed correctly");
		
      	//close the browser
      	driver.close();

	}

}
