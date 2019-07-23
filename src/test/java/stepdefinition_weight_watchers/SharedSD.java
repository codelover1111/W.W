package stepdefinition_weight_watchers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedSD {

	private static final String URL = "https://www.weightwatchers.com/us/";
	public static WebDriver driver=null;




@Given("^Given user open the default browser$")
@Before
public static void before() {

	 System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver");   
	 driver=new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(URL);
}

@Then("^I close the default browser$")
@After
public static void after() {
	if (driver != null) {
		driver.manage().deleteAllCookies();
		//driver.quit();
	}
}

public static WebDriver getDriver() {
	return driver;
}
}

