package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.BaseClass;

public class LoginLiveChat extends BaseClass
{
	@FindBy(xpath="//a[@class='ltkpopup-close']")
	WebElement close;

	@FindBy(xpath="//div[@class='LPMlabel']")
	WebElement Livechat;
	
	@FindBy(id ="txt_4616424")
	WebElement name;
	
	@FindBy(id="txt_4616425") 
	WebElement email;
	
	@FindBy(xpath="//button[@class='lp_submit_button lpc_survey-area__submit-button lpc_desktop']")
	WebElement submit;
	
	public LoginLiveChat()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void livechat()
	{
		close.click();
		Livechat.click();
	}
	 public  void enterDetails() 
	 {
		 name.sendKeys("Rahul");
		 email.sendKeys("babrs12345@gmail.com");
		 submit.click();
		 
	 }
	  
}
