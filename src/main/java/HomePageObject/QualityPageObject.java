package HomePageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QualityPageObject extends  BasePage  {
	
	@FindBy(xpath = "//div[@class='box-info-product']/div[2]/p/a[2]/span/i")
	private WebElement qtyPlusIcon;
	
	@FindBy(xpath = "//div[@class='box-cart-bottom']/div/p/button")
	private WebElement btnAddToCart;
	
	@FindBy(xpath = "//div[@class='layer_cart_product_info']/div[2]/span")
	private WebElement qtyTotalCost;




public  QualityPageObject() {
	PageFactory.initElements(driver, this);
	
}

public void pressTheQtyPlusIconButton() {
	qtyPlusIcon.click();
}

public void PressAddToCartButton() {
	btnAddToCart.click();	
}

public int getTotalCostOfTheProduct() {
	return qtyTotalCost.getAttribute("id");
}


}
