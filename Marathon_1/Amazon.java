package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
//TestCase: 2
public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Launch the Browser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver();
		//Load the Url
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		//Type "Bags for boys" in the Search box
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Bags for boys");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("//span[contains(text(),'Space ')]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		//Print the total number of results (like 50000)
		String totalNumber = driver.findElement(By.xpath("//span[contains(text(),'of over')]")).getText();
		System.out.println(totalNumber);
		//Select the first 2 brands in the left menu (like American Tourister, Generic)
		driver.findElement(By.xpath("(//i[contains(@class,'a-icon-checkbox')])[3]")).click();
		driver.findElement(By.xpath("(//i[contains(@class,'a-icon-checkbox')])[4]")).click();
		//Choose New Arrivals (Sort)
		WebElement sortElement = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select sortOptions=new Select(sortElement);
		sortOptions.selectByVisibleText("Newest Arrivals");
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
        //Print the first resulting bag info (name, discounted price)
		String name = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus')])[1]")).getText();
		String price = driver.findElement(By.xpath("(//span[contains(@class,'a-price-whole')])[1]")).getText();
		System.out.println("name: " +name+" discounted price: "+price);
		//Get the page title and close the browser
		System.out.println(driver.getTitle());
		driver.close();


	}

}
