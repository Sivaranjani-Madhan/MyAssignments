package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        //launch the browser		
				ChromeDriver driver=new ChromeDriver();
				//load the url
				driver.get("https://www.irctc.co.in/");
				//maximize
				driver.manage().window().maximize();					
	            //implict
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
     			//click on the "FLIGHTS" link.
	            //driver.findElement(By.linkText(" FLIGHTS ")).click();
				driver.findElement(By.xpath("//a[text()=' FLIGHTS ' ]")).click();	
				//getWindowHandles
				Set<String> allAddress = driver.getWindowHandles();			
				//declare an empty list
				List<String> addressList=new ArrayList<String>(allAddress);
			    //get parent window title
				String parentTitle = driver.getTitle();
				System.out.println("parent window title is " +parentTitle);
				////transfer to child window
				driver.switchTo().window(addressList.get(1));
				//close the current window
				//get child window title
				String childTitle = driver.getTitle();
				System.out.println("child window title is " +childTitle);
				driver.close();				
				//transfer to parent window
				driver.switchTo().window(addressList.get(0));				
				//close the current window
				driver.close();
				
	}

}
