package week5.day2;
//Home Assignment : Automation using Actions Class in Selenium
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Load the URL (https://www.amazon.in/)
		driver.get("https://www.amazon.in/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Search for "oneplus 9 pro"
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		//Get the price of the first product
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("price of the first product is: "+price);
		// Print the number of customer ratings for the first displayed product
		String ratingsCount = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base')])[2]")).getText();
		System.out.println("number of customer ratings for the first displayed product is: "+ratingsCount);
		//Click the first text link of the first image
		driver.findElement(By.xpath("(//h2[contains(@class,'a-size-medium')])[2]//span")).click();
		//Take a screenshot of the product displayed
		File source = driver.getScreenshotAs(OutputType.FILE);
		//set the destination for storing
		File destination=new File("./snaps/image1.png");
		//copy from source to destination
		FileUtils.copyFile(source, destination);
		// Click the 'Add to Cart' button.
		Thread.sleep(5000);
		WebElement scrollElement = driver.findElement(By.xpath("(//span[text()='Add to Cart']/preceding-sibling::input)[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement);
		//Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", scrollElement);
		//Get the cart subtotal and verify if it is correct.
		String subtotal = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		if(subtotal.equals(price))
			System.out.println("cart product price is: "+subtotal);
		else
			System.out.println("cart product is not correct");
		// Close the browser
		driver.close();
		
	}

}
