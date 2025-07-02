package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("https://dev209663.service-now.com");
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Login with valid credentials username as admin and password 
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("qy/Q6A=vOM3x");
		driver.findElement(By.id("sysverb_login")).click();
		//Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[text()='All']").click();
		Thread.sleep(1000);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service Catalog");
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		//Click on  mobiles
		WebElement eleFrame = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(eleFrame);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		//Select Apple iphone13pro
		WebElement scrollEle = shadow.findElementByXPath("//*[contains(text(), 'Request for Apple iPhone 13 pro')]");
		shadow.scrollTo(scrollEle);
		scrollEle.click();
		//Choose yes option in lost or broken iPhone
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		//Enter phonenumber as 99 in original phonenumber field
		driver.findElement(By.xpath("(//input[contains(@class,'cat_item_option')])[4]")).sendKeys("99");
		//Select Unlimited from the dropdown in Monthly data allowance
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class,'form-control')]"));
		Select options=new Select(dropdown);
		options.selectByValue("unlimited");
		//Update color field to SierraBlue and storage field to 512GB
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		WebElement scrollColor = driver.findElement(By.xpath("//label[text()='Sierra Blue']"));
		act.scrollToElement(scrollColor).perform();
		scrollColor.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='512 GB [add $300.00]']")).click();
		//Click on Order now option
		WebElement scrollOrder = driver.findElement(By.xpath("//button[text()='Order Now']"));
		Thread.sleep(1000);
		act.scrollToElement(scrollOrder).perform();
		scrollOrder.click();
		Thread.sleep(2000);
		//Verify order is placed and copy the request number
		String requestNumber = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("the request number is: "+requestNumber);
		//Take a Snapshot of order placed page
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snaps/service.png");
		FileUtils.copyFile(source, destination);
	}

}
