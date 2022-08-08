package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPOMClass 
{
private WebDriver driver;
	
	
	//finish button
	@FindBy(xpath="//button[@id='finish']")
    private WebElement finishButton;
	
	public void clickFinishButton()
	{
		finishButton.click();
	}
	
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
	private WebElement orderPlaced;
	
	public String getTextOrderPlaced()
	{
		String k=orderPlaced.getText();
		return k;
	}
	
	
	public OverviewPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
		
	}

}
