package HomePageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageObject extends  BasePage {
	
	   @FindBy(id = "block_top_menu")
	   private WebElement topBlockMenu;
	   
	   @FindBy(xpath = "//div[@id= 'block_top_menu']/div")
	   private WebElement topBlockCategories;

		@FindBy(xpath = "//div[@id = 'block_top_menu']/ul/li[1]/a")
		private WebElement topMenuWomen;
		
		@FindBy(xpath = "//div[@id = 'block_top_menu']/ul/li[2]/a")
		private WebElement topMenuDresses;
		
		@FindBy(xpath = "//div[@id = 'block_top_menu']/ul/li[3]/a")
		private WebElement topMenuTshirt;
		
		@FindBy(xpath = "//div[@id = 'block_top_menu']/ul/li[1]/a")
		private WebElement btnTopMenu;
		
		@FindBy(xpath = "//div[@id='left_column']/div/h2")
		private WebElement txtTitleBlockWomen;
		
		@FindBy(xpath = "//div[@id='categories_block_left']/h2")
		private WebElement txtTitleBlockDresses;
		
		@FindBy(xpath = "//div[@id='center_column']/h1/span")
		private WebElement txtTitleBlockTshirt;
		
		
		
		
		@FindBy(id = "newsletter-input")
		private WebElement txtBoxEmail_Id;
		
		@FindBy(name = "submitNewsletter")
		private WebElement btnSubmit;
		
		@FindBy(xpath = "//div[@id= 'columns']/p")
		private WebElement txtpopupMessage;
		
		
		public HomePageObject() {
			PageFactory.initElements(driver, this);
		}
		public void enterEmail_id(String user ){
			setText(txtBoxEmail_Id,  user);
			
		}
		public void pressSubmitButton() {
			btnSubmit.click();
		}
		
		public String getPopupMessage() {
			return txtpopupMessage.getText();
		
		}
		public WebElement  checkTopTitleWomenIsDisplayed() {
			return topMenuWomen;
			
		}
		public WebElement checkTopTitleDressIsDisplayed() {
			return topMenuDresses;
		}
		public WebElement checkTopTitleTshirtIsDisplayed() {
			return topMenuTshirt;
		}
		  
		public void btnMenuForWomen() {
			topMenuWomen.click();
			
		}
		public void btn1MenuForDresses() {
			topMenuDresses.click();
		}
		
		public void btn2MenuForTshirt() {
			topMenuTshirt.click();
		}
		
		
		
		public String getTxtTopMenuWomenIsNagivated() {
			return txtTitleBlockWomen.getText();
		}
		public String getTxtTopMenuDressesIsNagivated() {
			return txtTitleBlockDresses.getText();
		}
		public String getTxtTopMenuTshirtIsNagivated() {
			return txtTitleBlockTshirt.getText();
		}
		
		

		
		
		
			
			
		

			
			
			
			
		}

	




