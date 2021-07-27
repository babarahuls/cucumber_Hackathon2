package com.cucumber.stepDefinition;

import com.cucumber.base.BaseClass;
import com.cucumber.pages.LoginPage;
import com.cucumber.pages.LogoutPage;
import com.cucumber.utils.LoginData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutSteps 
{
	BaseClass base;
	LoginPage login;
	LoginData log;
	LogoutPage logout;
	
	@Given("^Launch the website$")
	public void launch_the_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		base = new BaseClass();
		base.initialization();
	}

	@When("^enter uname and password for logout$")
	public void enter_uname_and_password_for_logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login = new LoginPage();
	    log = new LoginData();
	    login.loginDetails(log.uid(), log.credpass());
	    login.submit();
	}

	@Then("^click on myaccount and logout$")
	public void click_on_myaccount_and_logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 logout = new LogoutPage();
		 logout.signout();
		 base.Close();
		  
	}


}
