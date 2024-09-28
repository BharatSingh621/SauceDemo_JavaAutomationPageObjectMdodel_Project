package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.ProductPage;
import Utils.TestBase;

public class Product extends TestBase
{

	@Test
	public void Product_TestCase_001() throws InterruptedException 
	{
			LoginPage loginPage = new LoginPage(driver);
			ProductPage productPage = new ProductPage(driver);
			loginPage.enterUsername("standard_user");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLoginButton();
			Thread.sleep(1000);
			String actualText =  productPage.GetProductText();
			String expectedText = "Products";			
			Assert.assertEquals(actualText, expectedText);				
	}
	
	@Test
	public void Product_TestCase_002() throws InterruptedException 
	{
			LoginPage loginPage = new LoginPage(driver);
			ProductPage productPage = new ProductPage(driver);
			loginPage.enterUsername("standard_user");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLoginButton();
			Thread.sleep(1000);		
			productPage.ClickButton_1();
			productPage.ClickButton_2();
			
			String actualCount = productPage.GetShoppingCart_Count();
			String expectedCount = "2";					
			Assert.assertEquals(actualCount, expectedCount);			
			
	}
	
}
