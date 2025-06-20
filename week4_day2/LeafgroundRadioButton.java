package week4.day2;

//Classroom Assignment <5>: Demonstrating Radio Button in Selenium

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafgroundRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initialize the WebDriver (ChromeDriver).
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		//load the URL
		driver.get("https://www.leafground.com/radio.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		//Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
		driver.findElement(By.xpath("//label[text()='Bengaluru']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']/preceding-sibling::div")).click();
		boolean isselectedCheck = driver.findElement(By.xpath("//label[text()='Bengaluru']/preceding-sibling::div")).isSelected();
		assertEquals(isselectedCheck,false); 
		//Identify the radio button that is initially selected by default
		boolean isselectedCheck2 = driver.findElement(By.xpath("(//label[text()='Safari']/preceding-sibling::div)[2]")).isEnabled();
		assertEquals(isselectedCheck2,true); 
		//Check and select the age group (21-40 Years) if not already selected.
		boolean isselectedCheck3 = driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding-sibling::div")).isEnabled();
		assertEquals(isselectedCheck3,true); 

	}

}
