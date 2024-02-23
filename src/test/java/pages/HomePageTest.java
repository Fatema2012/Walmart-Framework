package pages;

import static comon.ComonActions.clickElement;

import org.testng.annotations.Test;

import base.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled =false,priority=2  )
	public void searchField() throws InterruptedException {
		homePage.searchField();
		
	}
	@Test(enabled = false,priority = 1)
		public void logoElement() throws InterruptedException {
		homePage.logoElement();
			
		}
	/*@Test(enabled =false,priority = 3)
	public void sinInButton() throws InterruptedException  {
	homePage.signInButton();
	
	}*/
	
	/*@Test(enabled =true)
	public void SignInAccount () throws InterruptedException  {
	homePage.SignInAccount();
	}*/
	
	@Test(enabled =true)
	public void SignIncreateAccount() throws InterruptedException  {
	homePage.clickSignIncreateAccount();
	}
	}

