package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Classroom Assignment <1>: WebTable Interaction and Data Verification
public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Load the URL (https://erail.in/)
		driver.get("https://erail.in/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//- Enter "MAS" as the "From" station
		WebElement From = driver.findElement(By.id("txtStationFrom"));
		From.clear();
		From.sendKeys("MAS",Keys.ENTER);	
		//- Enter "MDU" as the "To" station.
		WebElement To = driver.findElement(By.id("txtStationTo"));
		To.clear();
		To.sendKeys("MDU",Keys.ENTER);
		//Uncheck the "Sort on Date" checkbox.
		driver.findElement(By.id("chkSelectDateOnly")).click();
		//Retrieve the train names from the web table.
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]/tbody/tr/td[2]"));
		//Verify if there are any duplicate train names in the web table.
		Set<String> uniqueTrains = new HashSet<>();
		Set<String> duplicates = new HashSet<>();

		for (int i = 0; i < trainNames.size(); i++) {
			String result = trainNames.get(i).getText();
			System.out.println(result);

			if (!uniqueTrains.add(result)) {
				duplicates.add(result);
			}
		}

		// Verify if there are any duplicate train names in the web table.
		if (!duplicates.isEmpty()) {
			System.out.println("Duplicate train names: " + duplicates);
		} else {
			System.out.println("No duplicate train names found.");
		}

		driver.close();
	}

}




