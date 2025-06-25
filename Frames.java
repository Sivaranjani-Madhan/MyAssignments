package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//switch to frame by index
		driver.switchTo().frame(1);
		//Click the "Try It" button inside the frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Click OK/Cancel in the alert that appears
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//- Confirm the action is performed correctly by verifying the text displayed
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println("text is: "+text );
		
	}

}
