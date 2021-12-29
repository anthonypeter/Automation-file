package HomePageTest;

import java.util.Random;
import org.testng.Assert;
import org.testng.annotations.Test;

import HomePageObject.HomePageObject;
      
public class HomePageTest {
	HomePageObject Home = new HomePageObject();
	int random = new Random().nextInt(50000);
	@Test(priority = 0)
	public void verifyMainTabsAreDisplayedOrNot() {
		Assert.assertTrue(Home.checkTopTitleWomenIsDisplayed().isDisplayed());
		Assert.assertTrue(Home.checkTopTitleDressIsDisplayed().isDisplayed());
		Assert.assertTrue(Home.checkTopTitleTshirtIsDisplayed().isDisplayed());
	}
	
	@Test(priority = 1)
	public void verifyNagivateFunction() {
		Home.btnMenuForWomen();
		Assert.assertTrue(Home.getTxtTopMenuWomenIsNagivated().contains("WOMEN"));
		Home.btn1MenuForDresses();
		Assert.assertTrue(Home.getTxtTopMenuDressesIsNagivated().contains("DRESSES"));		
		Home.btn2MenuForTshirt();
		Assert.assertTrue(Home.getTxtTopMenuTshirtIsNagivated().contains("T-SHIRTS"));				
		
	}

	@Test(priority = 2)
	public void verifyEmail_id() {
		Home.enterEmail_id("anthony" + random + "@gmail.com");
		Home.pressSubmitButton();
		Assert.assertTrue( Home.getPopupMessage().contains("successfully "));

	}
	
	
}
