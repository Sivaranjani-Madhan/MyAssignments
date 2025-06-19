package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindLowestPriceMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch browser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver();	
		//load the url
		driver.get("https://www.amazon.in/");
		//maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		//Search phones in the search field
		WebElement searchPhones = driver.findElement(By.id("twotabsearchtextbox"));
		searchPhones.sendKeys("phones");
		searchPhones.submit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Write common locator / xpath matching all the phone price in the page and get into List<Element>
		List<WebElement> priceList = driver.findElements(By.className("a-price-whole"));
		//- Get the values in a list and sort the values in ascending order
		List<Integer> allPrices=new ArrayList<Integer>();
		for(WebElement eachPrice : priceList)
		{
			String price = eachPrice.getText().replace(",","");
			allPrices.add(Integer.parseInt(price));
		}
		Collections.sort(allPrices);
		//- Get the first item from the sorted list which is the least price
		System.out.println("all price is "+allPrices);
		System.out.println("lowest price is " +(allPrices.get(0)));

	}

}
