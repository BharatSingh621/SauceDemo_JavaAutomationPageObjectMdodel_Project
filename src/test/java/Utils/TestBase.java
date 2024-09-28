package Utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase 
{

	 	protected WebDriver driver;

	    @BeforeMethod
	    public void setUp() 
	    {
	        driver = DriverFactory.getDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.saucedemo.com/");
	    }
	    
	    
	    @AfterMethod
	    public void tearDown() 
	    {
	        DriverFactory.closeDriver();
	    }
	    
}
