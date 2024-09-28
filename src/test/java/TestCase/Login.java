package TestCase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.ProductPage;
import Utils.TestBase;



public class Login extends TestBase 
{
	Logger logger = LogManager.getLogger(Login.class);
		

	@Test
	public void TestCase_001() throws InterruptedException 
	{
			driver.findElement(By.id("user-name")).sendKeys("Bharat Singh");
			Thread.sleep(3000);
	}
	
	
	@Test
	public void TestCase_002() throws InterruptedException 
	{
			logger.info("Creating object to the Login page.......");
			LoginPage loginPage = new LoginPage(driver);
			logger.info("Creating object to the Product page");			
			ProductPage productPage = new ProductPage(driver);
			loginPage.enterUsername("standard_user");
			loginPage.enterPassword("secret_sauce");
			logger.info("Tring to click login button");			
			loginPage.clickLoginButton();
			logger.info("Logoin button clicked");
			Thread.sleep(1000);
			String actualText =  productPage.GetProductText();
			logger.info("Getting product page Text...");
			String expectedText = "Products";			
			logger.info("Trying to assert...");
			Assert.assertEquals(actualText, expectedText);				
	}
	
}

