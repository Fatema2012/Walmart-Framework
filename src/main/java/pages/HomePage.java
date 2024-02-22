package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static comon.ComonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='q']")
	WebElement searchField;

	@FindBy(xpath = "//img[@class='db']")
	WebElement logoElement;

	@FindBy(xpath = "//div[contains(text(),'Sign In')]")
	WebElement signInButton;
	
@FindBy(xpath = "//div[text()='Account']")
WebElement SignInAccount;
	// i[@class='ld ld-Grid pr2']
By SignIncreateAccount=By.xpath("//button[contains(text(),'Sign')]");
 //WebElement SignIncreateAccount;

	public void searchField() {
	//	searchField.click();
		clickElement(searchField);
		//Thread.sleep(5000);
		pause(4);
	}

	public void logoElement() {
		//logoElement.click();
		clickElement(logoElement);
		//Thread.sleep(5000);
		pause(4);
	}

	public void signInButton() {
		clickElement(signInButton);
		pause(4);
	/*	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	*/	
	}
	
	public void SignInAccount() {
		clickElement(SignInAccount);
		pause(4);
	/*	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	*/}
	public void clickSignIncreateAccount() {
		driver.findElement(SignIncreateAccount).click();
			pause(4);
			
		
	}
	
	
}
