package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	WebDriver driver;
	
	public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
	
    By product_Heading = By.xpath("//span[contains(text(),'Products')]");
    By Add_to_Cart_Button_1 = By.id("add-to-cart-sauce-labs-backpack");
    By Add_to_Cart_Button_2 = By.id("add-to-cart-sauce-labs-bike-light");    
    By Shopping_card_Badge = By.xpath(" //span[@class='shopping_cart_badge']");
    
    
    public String GetProductText() 
    {
    	return driver.findElement(product_Heading).getText();
    }
        
    public void ClickButton_1() 
    {
    	driver.findElement(Add_to_Cart_Button_1).click();
    }

    public void ClickButton_2() 
    {
    	driver.findElement(Add_to_Cart_Button_2).click();
    }
	
    public String GetShoppingCart_Count() 
    {
    	return driver.findElement(Shopping_card_Badge).getText();
    }
}

