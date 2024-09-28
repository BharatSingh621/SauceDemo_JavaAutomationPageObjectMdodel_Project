package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverFactory 
{
	
	private static WebDriver driver;
	

	public static WebDriver getDriver() 
    {
    	      
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();        
            return driver;
    }
   
    public static void closeDriver() 
    {
    
    		driver.quit();    		
    }  

}
