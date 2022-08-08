package com.sauceDemo.TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.HomePOMClass;
import com.sauceDemo.POMPackage.LoginPOMClass;



public class TC03VerifyBagProductAddToCartFunctionality extends Test_BaseClass
{
	
	
	@Test
	public void bagProductAddToCart()
	{
		//bag product add to cart
		HomePOMClass lg=new HomePOMClass(driver);
		
	  	lg.clickonBagProduct();
		System.out.println("clicked bag product");
		
		String actualResult="1";
		
		String ExpectedResult=lg.getTextFromAddToCart();
		
		Assert.assertEquals(actualResult, ExpectedResult);
	}
	    
		
	}


