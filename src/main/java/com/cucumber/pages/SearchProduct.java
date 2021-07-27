package com.cucumber.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.BaseClass;

public class SearchProduct extends BaseClass 
{
	@FindBy(xpath="//a[@class='ltkpopup-close']")
	WebElement close;
	
	@FindBy(xpath ="//span[text()=\"Account\"]")
	WebElement account;
	
	@FindBy(xpath ="(//a[text()=\"My Account\"])[1]")
	WebElement myacc;
	
	@FindBy(xpath ="//input[@id='dwfrm_login_username']")
	WebElement user;
	
	@FindBy(xpath ="//input[@id='dwfrm_login_password']")
	WebElement passwd;
	
	@FindBy(xpath ="//input[@id='dwfrm_login_rememberme']")
	WebElement remember;
	
	 @FindBy(name ="dwfrm_login_login")
	    WebElement log;
	 
	// @FindBy(xpath ="//input[@placeholder='Search all light and living']")
	 //   WebElement searchbar;
	 
	 @FindBy(xpath ="//*[@id=\"searchinput\"]")
	    WebElement searchbar;
	 
	 //@FindBy(xpath ="//*[@id=\"simplesearchbtn\"]/i")
	 //   WebElement enter;
	 
	 
	 @FindBy(xpath ="//*[@id=\"simplesearchbtn\"]/i")
	    WebElement enter;
	
	 public SearchProduct()
	 {
			PageFactory.initElements(driver, this);
		}

	 
//	 public void login(String uname,String upass)
//	 {
//		 close.click();	
//			account.click();
//			myacc.click();
//			user.clear();
//			user.sendKeys(uname);
//			passwd.sendKeys(upass);
//			close.click();
//			remember.click();
//			//Thread.sleep(5000);
//			log.click();
//	 }
	 public void search() throws InterruptedException
	 {
		 //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 searchbar.sendKeys("Fan");
		//Thread.sleep(2000);
		 enter.click();
	 }
}
