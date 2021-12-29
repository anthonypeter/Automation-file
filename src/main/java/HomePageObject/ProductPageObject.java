package HomePageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.interactions.touch.Move;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageObject extends  BasePage {
	
	@FindBy(xpath = "//div[@id ='short_description_content']/p")
	private WebElement txtProductDescription;
	
	@FindBy(xpath = "//div[@id='center_column']/div/div/div[3]/p[7]/button[1]")
	private WebElement btnSocialLinks;
	
	@FindBy(xpath = "//ul[@class='product_list grid row']/li[1]/div/div[2]/div[2]/a[2]/span")
	private WebElement ToFirstProductList;
	
    public  ProductPageObject() {
		PageFactory.initElements(driver, this);
	}

public WebElement checkSocialLinksOrDisplayed() {
	return btnSocialLinks;
}

public WebElement checkProductDescriptionIsDisplayed() {
	return txtProductDescription;
}
public void clickTheProductGivenBelow(){
	ToFirstProductList.click();
}

}
