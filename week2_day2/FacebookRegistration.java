package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize ChromeDriver
		ChromeOptions option =new ChromeOptions();
		option.addArguments("guest");

		ChromeDriver driver =new ChromeDriver(option);
		
		//load the url
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		//Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("fname");
		
		//Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("sname");
		
		//Enter the Mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		
		//Enter the New password
		driver.findElement(By.id("password_step_input")).sendKeys("testing");
		
		//Handle all three dropdowns in Date of birth
		//select date
		WebElement sourcedropDown = driver.findElement(By.id("day"));		
		Select dropdown=new Select(sourcedropDown);
		dropdown.selectByIndex(12);
		
		//select month		
		WebElement sourcedropDown1 = driver.findElement(By.id("month"));		
		Select dropdown1=new Select(sourcedropDown1);		
		dropdown1.selectByVisibleText("Mar");
		
		//select year
		WebElement sourcedropDown2 = driver.findElement(By.id("year"));
		Select dropdown2=new Select(sourcedropDown2);
		dropdown2.selectByValue("1997");
		
		//Select the radio button in Gender
		driver.findElement(By.xpath("//input[@value='1']")).click();
	}

}
