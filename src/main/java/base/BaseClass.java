package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;

	// Test out github

	@BeforeMethod

	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
		"/Users/macbook/eclipse-workspace/com.walmart/driver/chromedriver");
		// System.setProperty("WebDriver.chrome.driver",System.getProperty("user.driver"
		//)+"/driver./chromedriver.exe" );
		//System.setProperty("WebDriver.chrome.driver", "/.driver.chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.walmart.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		homePage = new HomePage(driver);
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
