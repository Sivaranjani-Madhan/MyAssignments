package week4.day2;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LeafgroundCheckoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initialize ChromeDriver
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		//load the url
		driver.get("https://leafground.com/checkbox.xhtml");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Click on the "Notification Checkbox." Ajax
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		Thread.sleep(5000);
		//- Verify that the expected message is displayed.
		WebElement validation = driver.findElement(By.xpath("//span[text()='Checked']"));
		if(validation.getText().equals("Checked"))
			System.out.println("expected message " +(validation.getText() +" is displayed"));
		else
			System.out.println("expected message is not displayed");
		// Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		//Click on the "Tri-State Checkbox."
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[8]")).click();
		//Verify which tri-state option has been chosen.
		Thread.sleep(6000);
		 String text = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p")).getText();
		 System.out.println(text);
		//Click on the "Toggle Switch."
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		Thread.sleep(5000);
		//Verify that the expected message is displayed.
		WebElement toggleChecked = driver.findElement(By.xpath("//span[text()='Checked']"));
		Thread.sleep(2000);
		if(toggleChecked.getText().equals("Checked"))
			System.out.println("expected message " +(validation.getText() +" is displayed"));
		else
			System.out.println("expected message is not displayed");
		//Verify if the Checkbox is disabled.
		WebElement disabled = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox')])[3]"));
		System.out.println("Checkbox is " +(disabled.getText()));
		//Select multiple options on the page (details may be needed)
		driver.findElement(By.className("ui-selectcheckboxmenu-trigger")).click();
		List<WebElement> elements = driver.findElements(By.xpath("(//label[text()='Miami'])[2] | (//label[text()='Paris'])[2]"));	
		for(WebElement element : elements)
		{
			element.click();
			System.out.println(element.getText());
		}
		driver.findElement(By.className("ui-selectcheckboxmenu-trigger")).click();
		//- Close the web browser when done.
		driver.close();
}
}
