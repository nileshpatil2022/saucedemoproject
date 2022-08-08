package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMPackage.LoginPOMClass;
import com.sauceDemo.UtilityPackage.TakeScreenShot;

public class Test_BaseClass 
{
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"./DriverFolder/chromedriver.exe");
		 driver= new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver",
					"./DriverFolder/geckodriver.exe");
			 driver= new FirefoxDriver();
			
		}
		 
		 
		 
		 
		System.out.println("Browser is Opened");
		driver.manage().window().maximize();
		System.out.println("Browser is  Maximised");
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is Opened");
		TakeScreenShot.screenshot(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPOMClass login=new LoginPOMClass(driver);
		
		login.senKeysUsername();
		System.out.println("Username is entered");
		
		login.senkeysPassward();
		System.out.println("Password is Enterd");
		
		login.clickLoginButton();
		System.out.println("Click on Login Button");
		TakeScreenShot.screenshot(driver);
		
	}
	
	@AfterMethod()
	 public void tearDown()
	 {
	 driver.quit();
	 
	 System.out.println("Browser is Closed");
	 }
	

}
