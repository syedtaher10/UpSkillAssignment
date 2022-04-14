package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class googleStepDefinitions {
	
	WebDriver driver;
	
	@Given("To launch the google browser")
	public void to_launch_the_google_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0037FQ744\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.manage().window().maximize();
	}

	@When("The search bar is visible")
	public void the_search_bar_is_visible() {
		System.out.println(driver.findElement(By.name("q")).isDisplayed());

	}

	@Then("Enter the text syed")
	public void enter_the_text_syed() {
		driver.findElement(By.name("q")).sendKeys("syed");
	}

	@Then("Enter the text {string}")
	public void enter_the_text(String string) {
	    driver.findElement(By.name("q")).sendKeys(string);
	}

}
