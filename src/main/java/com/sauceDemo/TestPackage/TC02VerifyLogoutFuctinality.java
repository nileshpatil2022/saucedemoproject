package com.sauceDemo.TestPackage;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.HomePOMClass;
import com.sauceDemo.POMPackage.LoginPOMClass;

public class TC02VerifyLogoutFuctinality extends Test_BaseClass
{
	
	
	@Test
	public void verifyLogOut()
	{
		
		
		//homepage settingButton and LogoutButton
		HomePOMClass lg=new HomePOMClass(driver);
		
		lg.clicksettingButton();
		System.out.println("setting button clicked");
		
		lg.clickLogOutButton();
		System.out.println("Logout Button is clicked");
		
		
		String ExpectedResult="Swag Labs";
		
		String ActualResult=driver.getTitle();
		
		
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
		
		
	

}
