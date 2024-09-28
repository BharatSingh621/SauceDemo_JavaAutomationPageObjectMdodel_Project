package TestCase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObject.LoginPage;
import PageObject.ProductPage;
import Utils.TestBase;
import Utils.ExcelUtility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LoginTestCaseWithDataProvider extends TestBase 
{

	
	@DataProvider(name="LoginData")
	public String[][] GetData() throws Exception 
	{
		String excelFilePath=".//src//test//resources//SauceDemo.xlsx";
		ExcelUtility excelUtility = new ExcelUtility(excelFilePath); 
		int rows = excelUtility.getRowCount("LoginData"); 
		int columns = excelUtility.getColumnCount("LoginData", 1); 
		String userLogindata[][] = new String[rows][columns];
		
		for(int i=1;i<=rows;i++) 
		{
			for(int j=0;j<columns;j++) 
			{
			userLogindata[i-1][j] = excelUtility.getCellData("LoginData", i, j);
			}
		} 
		return userLogindata;	

	}
		
		

	@Test(dataProvider="LoginData")
	public void TestCase_001(String username, String password) throws InterruptedException 
	{
			driver.findElement(By.id("user-name")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);;
			
			driver.findElement(By.id("login-button")).click(); 
			String actual_text=  driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText(); 
			String expected_text="Products"; 
			Assert.assertEquals(actual_text, expected_text);
	}
	
	
	
	
	
	
	
}
