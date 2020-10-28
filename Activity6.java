package suiteExample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity6 
{
	WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void beforeClass()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
  @Test
  @Parameters({"username","password"})
  public void testPrameters(String username,String password) 
  {
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.cssSelector("button[onclick=\'signIn()\']")).click();
	  String loginMsg = driver.findElement(By.id("action-confirmation")).getText();
	  Assert.assertEquals("Welcome Back, admin",loginMsg);
	  System.out.println(loginMsg);
	
  }
  
 


  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
----------------------testng6.xml-------------------------------

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="Activity6" >
    <test name="Test6" >
    <parameter name = "username" value = "admin" />
     <parameter name = "password" value = "password" />
     <classes>
     <class name = "suiteExample.Activity6"/>
     </classes>
     </test>
     </suite>
