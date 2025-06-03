package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys(("password"));
		driver.findElement(By.name("login")).click();
		
	}

}
