package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Utils.TestBase;



public class Login extends TestBase {

	
	@Test
	public void TestCase_001() throws InterruptedException 
	{
			driver.findElement(By.id("user-name")).sendKeys("Bharat Singh");
			Thread.sleep(3000);
	}
	
	
	@Test
	public void TestCase_002() throws InterruptedException 
	{
			driver.findElement(By.id("user-name")).sendKeys("Bharat Singh");
			Thread.sleep(3000);
	}
	
	
	
}
