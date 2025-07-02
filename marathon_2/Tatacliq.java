package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//TestCase 1: Tatacliq Testcase:
public class Tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//launch the driver
		ChromeDriver driver=new ChromeDriver();
		//Load the url as https://www.tatacliq.com/
		driver.get("https://www.tatacliq.com/");
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//MouseHover on 'Brands'
		Actions act=new Actions(driver);
		WebElement mouseHoverElement = driver.findElement(By.xpath("//div[text()='Brands']"));
		act.moveToElement(mouseHoverElement).perform();
		//MouseHover on 'Watches & Accessories'
		WebElement mouseHoverElement1 = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		act.moveToElement(mouseHoverElement1).perform();
		//Choose the first option from the 'Featured brands'.
		driver.findElement(By.xpath("//div[@class='DesktopHeader__brandsDetails']")).click();
		//Select sortby: New Arrivals
		WebElement dropdownList = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select options=new Select(dropdownList);
		options.selectByVisibleText("New Arrivals");
		//choose men from catagories filter.
		driver.findElement(By.className("FilterDesktop__newFilName")).click();
		//print all price of watches
		Thread.sleep(5000);
		List<WebElement> priceList = driver.findElements(By.xpath("//h3[@class='ProductDescription__boldText']/preceding::div[@class='ProductDescription__priceHolder']"));
		for(WebElement prices:priceList)
		{
			String price = prices.getText();
			System.out.println(price);
		}
		//click on the first resulting watch. 
		driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
		//compare two price are similar
		WebElement price1=priceList.get(0);
		String priceText=price1.getText().replaceAll("[^0-9]", "");
		System.out.println("price1 is: "+priceText);
		//switching to child window
		Set<String> windows = driver.getWindowHandles();
		List<String> allWindows=new ArrayList<String>(windows);
		driver.switchTo().window(allWindows.get(1));
		String price2 = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		String priceValue2 = price2.replaceAll("[^0-9]", "");
		System.out.println("price2 value is: "+priceValue2);
		if(priceText.contains(priceValue2))
			System.out.println("both are similar");
		else
			System.out.println("both are not similar");
		//click Add to cart and get count from the cart icon.
		WebElement scrollDown = driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
		Thread.sleep(2000);
		act.scrollToElement(scrollDown).perform();
		scrollDown.click();
		String cartCount = driver.findElement(By.className("DesktopHeader__cartCount")).getText();
		System.out.println("CartCount is: "+cartCount);
		//Click on the cart
		driver.findElement(By.className("DesktopHeader__myBagShow")).click();
		Thread.sleep(2000);
		//Take a snap of the resulting page.
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snaps/image.png");
		FileUtils.copyFile(source, destination);
		//Close All the opened windows one by one.
		driver.close();
		driver.switchTo().window(allWindows.get(0));
		driver.close();
		
	}

}
