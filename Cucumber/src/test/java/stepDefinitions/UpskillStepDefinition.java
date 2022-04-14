package stepDefinitions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class UpskillStepDefinition {
	
	WebDriver driver;
	
	@Given("Open {string} and click on SignUp button")
	public void open_and_click_on_SignUp_button(String URL) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0037FQ744\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement signup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' Sign up! ']")));
		signup.click();
	}
	
	@When("Fill up the registration form for all mandatory fields")
	public void fill_up_the_registration_form_for_all_mandatory_fields() throws InterruptedException {
	    Thread.sleep(5000);
	    driver.findElement(By.name("firstname")).sendKeys("Syed1");
	    driver.findElement(By.name("lastname")).sendKeys("Taher1");
	    driver.findElement(By.name("email")).sendKeys("syed1@gmail.com");
	    driver.findElement(By.name("username")).sendKeys("SyedTaher1");
	    driver.findElement(By.name("pass1")).sendKeys("Bismil@10");
	    driver.findElement(By.name("pass2")).sendKeys("Bismil@10");
	}

	@Then("Submit the Details")
	public void submit_the_Details() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.name("submit")).submit();
	}

	@Then("Verify message {string}")
	public void verify_message(String string) throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> confirmationtexts = driver.findElements(By.tagName("p"));

        System.out.println(confirmationtexts.size());

        for (WebElement webElement : confirmationtexts) {
            String texts = webElement.getText();
            if(texts.contains(string)) {
            	System.out.println(string + ": Text Verified");
            	break;
            }
        }
	}

	@When("Click on Next button")
	public void click_on_Next_button() {
	    driver.findElement(By.name("next")).click();
	}

	@Then("Verify you landed on Homepage and click your username field")
	public void verify_you_landed_on_Homepage_and_click_your_username_field() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement homepage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='tab-homepage']")));
		if(homepage.isDisplayed()) {
			System.out.println("User Landed on Homepage");
		}
	}

	@Then("Choose profile from dropdown")
	public void choose_profile_from_dropdown() throws InterruptedException {
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//li[@class='dropdown']")).click();
	    driver.findElement(By.xpath("//a[text()=' Profile']")).click();
	}

	@When("Click on Messages")
	public void click_on_Messages() throws InterruptedException {
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//li[@class='messages-icon ']")).click();
	}

	@Then("Click on compose message")
	public void click_on_compose_message() throws InterruptedException {
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@title='Compose message']")).click();
	}

	@Then("Enter the details shown on the page")
	public void enter_the_details_shown_on_the_page() throws InterruptedException {
		WebElement textSendTo = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		textSendTo.sendKeys("dfg");
		Thread.sleep(3000);
		textSendTo.sendKeys(Keys.ARROW_DOWN +""+ Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control'][@name='title']")).sendKeys("Java");
		
	}

	@Then("Click on Send Message button")
	public void click_on_Send_Message_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Send message']")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
