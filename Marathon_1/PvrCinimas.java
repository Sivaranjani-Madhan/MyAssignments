package Marathon1;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

//TestCase: 1

public class PvrCinimas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the Browser
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver();
		//Load the Url "https://www.pvrcinemas.com/"
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Choose Your location as "Chennai" (sometimes it will be located automatically)
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		//Click on Cinema under Quick Book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		//Select Your Cinema
		 driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		//Select cinemaOptions=new Select(Cinema);
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		//Select Your Date as Tomorrow
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		// Select Your Movie
		driver.findElement(By.xpath("(//span[text()='DNA'])[2]")).click();
		//Select Your Show Time
		driver.findElement(By.xpath("//span[contains(text(),'07:20')]")).click();
		// Click on Book Button 
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		//Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//Click any one available seat
		driver.findElement(By.xpath("(//span[text()='19'])[4]")).click();
		//Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//Print the Seat info under book summary
		String seatNo = driver.findElement(By.className("seat-number")).getText();
		System.out.println(seatNo);
		//Print the grand total under book summary
		String grandTotal = driver.findElement(By.xpath("//h6[text()='Grand Total']")).getText();
		System.out.println(grandTotal);
		Thread.sleep(2000);
		//Click Continue Button
		//driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		//Close the popup
		driver.findElement(By.xpath("(//i[contains(@class, 'pi-times')])[2]")).click();
		//Print Your Current Page title
		System.out.println(driver.getTitle());
		//Close Browser
		driver.close();
		
	}

}
