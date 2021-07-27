package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.BaseClass;

public class AccountPage extends BaseClass
{
	@FindBy(xpath="//a[@class='ltkpopup-close']")
	WebElement close;
	
	@FindBy(xpath ="//span[text()=\"Account\"]")
	WebElement account;
	
	@FindBy(linkText="My Account") 
	WebElement myacc;
	
	@FindBy(id = "dwfrm_profile_customer_firstname")
	WebElement firstname;
	
	@FindBy(id = "dwfrm_profile_customer_lastname")
	WebElement lastname;
	
	@FindBy(id = "dwfrm_profile_customer_email")
	WebElement email;
	
	@FindBy(id = "dwfrm_profile_customer_emailconfirm")
	WebElement confemail;
	
	@FindBy(id = "dwfrm_profile_login_password")
	WebElement passwd;
	
	@FindBy(id = "dwfrm_profile_login_passwordconfirm")
	WebElement confpass;
	
	@FindBy(name = "dwfrm_profile_confirm")
	WebElement create;
	
	public AccountPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AccountCreate() throws InterruptedException {
		close.click();
		account.click();
		myacc.click();
		//close.click();
		
	}
	public void enterDetails(String fname,String lname,String emailid,String confemailid,String pass,String confpasswd) {
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		email.sendKeys(emailid);
		confemail.sendKeys(confemailid);
		passwd.sendKeys(pass);
		confpass.sendKeys(confpasswd);
		//create.click();
		
	}
	public void createacc() {
		create.click();
	}

}
