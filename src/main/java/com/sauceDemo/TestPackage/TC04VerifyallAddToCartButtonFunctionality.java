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

public class TC04VerifyallAddToCartButtonFunctionality extends Test_BaseClass
{
	
    @Test 
	public void allProductAddToCart() 
	{
		//click all button
		
		HomePOMClass hm=new HomePOMClass(driver);
		
		hm.clickalladdToCartButton();
		
		//validation
		String ExpectedResult="6";
		
		//actual result
		 String actualResult= hm.getTextFromAddToCart();
		 
		 Assert.assertEquals(actualResult, ExpectedResult);
	}
		
		
	}

