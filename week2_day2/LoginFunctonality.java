package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginFunctonality {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.edge.driver", "D:\\SELENIUM\\TestLeaf\\SeleniumTraining\\driver\\msedgedriver.exe");
		//EdgeDriver  driver=new EdgeDriver();
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		//Enter the username
		
		//Find the element findElement()
		
		//Enter the value in text field  sendKeys
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on the login button
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}

}
