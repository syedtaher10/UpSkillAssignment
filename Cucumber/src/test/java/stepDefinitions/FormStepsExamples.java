package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FormStepsExamples {
	
	WebDriver driver;
	
	@Given("Launch https:\\/\\/demoqa.com\\/automation-practice-form URL")
	public void launch_https_demoqa_com_automation_practice_form_URL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0037FQ744\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
	}

	@When("Verify Student Registration Form Header")
	public void verify_Student_Registration_Form_Header() {
	    System.out.println(driver.findElement(By.xpath("//h5[text()='Student Registration Form']")).isDisplayed());
	}

	@Then("Enter Values {string} {string} {string} {string} {string}")
	public void enter_Values(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(string2);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(string3);
        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys(string4);
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys(string5);
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Then("Enter Values in Form")
	public void enter_Values_in_Form(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //List<String> data = dataTable.asList();
	    Map<String, String> mData = dataTable.asMap(String.class, String.class);
	    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(mData.get("firstName"));
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(mData.get("lastName"));
	    
	}


}
