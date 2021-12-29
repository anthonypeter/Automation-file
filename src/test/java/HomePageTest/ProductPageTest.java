package HomePageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import HomePageObject.DressPageObject;
import HomePageObject.HomePageObject;
import HomePageObject.ProductPageObject;

public class ProductPageTest {
	ProductPageObject Product = new ProductPageObject();
	HomePageObject Home = new HomePageObject();
	DressPageObject Dress = new DressPageObject();

	
@Test
public void verifyProductDiscriptionIsDisplayed() {
	Home.btnMenuForWomen();
	Dress.MouseAction();
	Product.clickTheProductGivenBelow();
	Assert.assertTrue(Product.checkProductDescriptionIsDisplayed().isDisplayed());
}
@Test
public void verifySocialLinksOrDisplayedOrNot() {
	Home.btnMenuForWomen();
	Dress.MouseAction();
	Product.clickTheProductGivenBelow();
	Assert.assertTrue(Product.checkSocialLinksOrDisplayed().isDisplayed());
}
}
