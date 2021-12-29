package HomePageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressPageObject extends  BasePage {
	@FindBy(xpath = "//div[@id='uniform-layered_id_attribute_group_1']" )
	private WebElement checkBoxSmall;
	
	@FindBy(xpath = "//div[@id='uniform-layered_id_attribute_group_2']" )
	private WebElement checkBoxMedium;
	
	@FindBy(xpath = "//div[@id='uniform-layered_id_attribute_group_3']" )
	private WebElement checkBoxLong;
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement txtSmallSize;
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement txtMediumSize;
	
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement txtLongSize;
	
	@FindBy(xpath = "//span[@class='heading-counter']")
	private WebElement txtHeadingCount;
	
	@FindBys({@FindBy(xpath = "//div[@id ='center_column']/ul/li")})
	private List<WebElement> countTotalProduct;
	
	@FindBy(xpath = "//div[@id ='center_column']/ul/li[1]")
	private WebElement moveToProductList;
	
	@FindBy(xpath = "//div[@id='layer_cart']/div/div[2]/div[4]/span")
	private WebElement btnContinueShopping;
	
	
	@FindBy(xpath = "//ul[@class='product_list grid row']/li[1]/div/div[2]/div[2]/a[1]/span")
	private WebElement btnAddToCart;
	
	@FindBy(xpath = "//div[@id='layer_cart']/div/div/h2/i")
	private WebElement txtProductIsAdded;
	
	
	public  DressPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	public String txtSmallSizeIsDispalyed()
	{
		return txtSmallSize.getText();
	}
	
	public String txtMediumSizeIsDispalyed()
	{
		return txtMediumSize.getText();
	}
	
	public String txtLongSizeIsDispalyed()
	{
		return txtLongSize.getText();
	}
	
	public void getCheckBoxIsVisible() {
		checkBoxSmall.click();
		
	}
	
	public int showProductList() {
		return countTotalProduct.size();
		}
	
	public int showHeadingCount() {
		return Integer.parseInt(txtHeadingCount.getText().split(" ")[2]);
	}
	
	public String getTxtAddCartButton() {
		return btnAddToCart.getText(); 
	}
	
	public String getTxtIsTheProductIsAddedInTheCartOrNot() {
		return txtProductIsAdded.getText();
	}
	
	public void AddToCart() {
		 btnAddToCart.click();
	}
	
	public void MouseAction() {
		MouseOver(moveToProductList);
	}
	public void clickContinueShoppingButton() {
		btnContinueShopping.click();
	}
	
	}


