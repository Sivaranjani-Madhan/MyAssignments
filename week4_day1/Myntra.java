package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		//maximize the window
		driver.manage().window().maximize();
		//- Launch the URL 
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//close the location 
		//driver.findElement(By.id("closeBtn")).click();
		// In the search box, type as "bags" and press enter
		WebElement searchElement = driver.findElement(By.className("desktop-searchBar"));
		searchElement.sendKeys("bags");
		searchElement.sendKeys(Keys.ENTER);
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[text()='Men']")).click();	
		Thread.sleep(2000);
		//Under "Category" click "Handbags"
		driver.findElement(By.xpath("//label[text()='Handbags']")).click();
		Thread.sleep(2000);
		//- Print the count of the items found. 
		WebElement totalCount = driver.findElement(By.xpath("(//span[@Class='categories-num'])[4]"));
		System.out.println(totalCount.getText());
		Thread.sleep(4000);
		//- Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brandList = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		List<String> allList=new ArrayList<String>();
		for(WebElement eachList :brandList)
		{
			String List=eachList.getText();
			allList.add(List);
		}
		System.out.println(allList);
		//- Get the list of names of the bags and print it
		List<WebElement> bagList = driver.findElements(By.xpath("//h4[@class='product-product']"));
		List<String> allBag=new ArrayList<String>();
		for(WebElement eachBag: bagList)
		{
			String bagText = eachBag.getText(); 
			allBag.add(bagText);
		}
		System.out.println(allBag);
	}

}
