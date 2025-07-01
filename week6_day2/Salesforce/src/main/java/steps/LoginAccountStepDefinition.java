package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAccountStepDefinition {

	public ChromeDriver driver;
	
	@Given("Launch browser and load URL")
	public void launch_browser_and_load_url() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		//get URL
		driver.get("https://login.salesforce.com/");
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	}

	@Given("Enter username and password")
	public void enter_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("bhuvanesh.moorthy@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@2025");
		
	  
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.id("Login")).click();	
	   
	}

	@Then("It should navigate to the next page")
	public void it_should_navigate_to_the_next_page() {
		System.out.println("login successful");
	   
	}

	@When("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(2000);
	   
	}

	@When("Click view All and click Sales from App Launcher")
	public void click_view_all_and_click_sales_from_app_launcher() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(1000);
			   
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {
		WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", account);
	  
	}

	@When("Click on New button")
	public void click_on_new_button() throws InterruptedException {
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(1000);
	    
	}

	@Then("New account page should be displayed")
	public void new_account_page_should_be_displayed() {
		System.out.println("navigated to the new account page");
	    
	}

	@When("Enter {string} as account name")
	public void enter_sivaranjani_as_account_name(String name) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	  
	}

	@When("Select Ownership as Public")
	public void select_ownership_as_public() throws InterruptedException {
		Actions act=new Actions(driver);
		WebElement scrolldown = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input')])[4]"));
		act.scrollToElement(scrolldown).perform();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", scrolldown);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	   
	}

	@When("Click save")
	public void click_save() {
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	  
	}

	@Then("Account name should be Sivaranjani")
	public void account_name_should_be_sivaranjani() {
		String accountName = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		System.out.println("accountName is: "+accountName);
	   
	}



}
