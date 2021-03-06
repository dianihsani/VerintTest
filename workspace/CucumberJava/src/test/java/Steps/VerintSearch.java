package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerintSearch {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("#1 - Browser is opened");
	
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.navigate().to("https://verint.com");
	}

	@When("user enters {string} on search bar")
	public void user_enters_on_search_bar(String string) {
		System.out.println("#3 - User enters search word on search bar");
	
		//driver.findElement(By.className("css-d29rte")).sendKeys("Costumer Solution");
		WebElement findSearch = driver.findElement(By.id("downshift-0-input"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		findSearch.sendKeys("Costumer Solution");
		driver.findElement(By.className("sj-input__button css-1k4nm74")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		System.out.println("#5 - Search result appears on page");
	}
}
