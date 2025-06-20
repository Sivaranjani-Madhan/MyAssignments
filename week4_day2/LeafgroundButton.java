package week4.day2;
//Home Assignment <3>: Leafground Button Interaction

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafgroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize the WebDriver (ChromeDriver).
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		//load the URL
		driver.get("https://leafground.com/button.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the button with the text ‘Click and Confirm title
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//Verify that the title of the page is ‘dashboard.’
		String title = driver.getTitle();
		if(title.equals("Dashboard"))
			System.out.println(title+ " is correct");
		else
			System.out.println(title+ "is not correct");
		driver.navigate().back();
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled
		 boolean isDisabled = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']")).isEnabled();
		System.out.println(isDisabled);
		//Find and print the position of the button with the text ‘Submit.’
		Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println("position is: "+location);
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
		System.out.println("bacground color is: "+cssValue);
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("size is: " +size);
		//Close the browser window
		driver.close();
	}

}
