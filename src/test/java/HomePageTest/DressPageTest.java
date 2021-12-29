package HomePageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import HomePageObject.DressPageObject;
import HomePageObject.HomePageObject;

public class DressPageTest {
	DressPageObject Dress = new DressPageObject();
	HomePageObject Home = new HomePageObject();

@Test(priority = 0)
public void verifySizesIsDispalyed() {
	Home.btnMenuForWomen();
	Assert.assertTrue(Dress.txtSmallSizeIsDispalyed().contains("S"));
	Assert.assertTrue(Dress.txtMediumSizeIsDispalyed().contains("M"));
	Assert.assertTrue(Dress.txtLongSizeIsDispalyed().contains("L"));
}
@Test(priority = 1)
public void verifyHeadingCountIsEqualToProductCount() {
	Home.btnMenuForWomen();
	Assert.assertEquals(Dress.showHeadingCount(), Dress.showProductList());	
	
}
@Test(priority = 2)
public void verifyProductIsAddredTocart() {
	Home.btnMenuForWomen();
	Dress.MouseAction();
	Assert.assertTrue(Dress.getTxtAddCartButton().contains("Add to cart"));
	Dress.AddToCart();
	//Assert.assertTrue(Dress.getTxtIsTheProductIsAddedInTheCartOrNot().contains("successfully "));
	//Dress.clickContinueShoppingButton();

}
}
