package com.cucumber.stepDefinition;

import com.cucumber.base.BaseClass;
import com.cucumber.pages.LoginPage;
import com.cucumber.utils.LoginData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps
{
	BaseClass base;
	LoginPage login;
	LoginData log;
	
	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		base = new BaseClass();
		base.initialization();
	}

	@When("^enter the username and password$")
	public void enter_the_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login = new LoginPage();
	    log = new LoginData();
	    login.loginDetails(log.uid(), log.credpass());
	}

	@Then("^click on continue$")
	public void click_on_continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  login = new LoginPage();
		  login.submit();
		  base.Close();
	}

}
