package com.cucumber.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.BaseClass;

public class LogoutPage extends BaseClass
{
	@FindBy(xpath="//a[@class='ltkpopup-close']")
	WebElement close;
	
	//@FindBy(xpath ="//span[text()=\"Account\"]")
	@FindBy(xpath ="//div[@class='btn-group dropdown-group']")
    WebElement account;
	
   // @FindBy(xpath = "//a[text()='Sign Out']")
	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
    WebElement signout;
    
    
    public LogoutPage() {
    	PageFactory.initElements(driver, this);
    }

     

        public void signout() 
        {
       	close.click();
            Actions action = new Actions(driver);
            action.moveToElement(account).build().perform();
            
            System.out.println("Mouseover action moved successfully");
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

     

            Actions action1 = new Actions(driver);
            action1.moveToElement(signout).build().perform();
            System.out.println("Logout successfully");
           // driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

        	account.click();
        	signout.click();

        }

}
