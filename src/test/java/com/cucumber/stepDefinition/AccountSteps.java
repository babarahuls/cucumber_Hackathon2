package com.cucumber.stepDefinition;

import com.cucumber.base.BaseClass;
import com.cucumber.pages.AccountPage;
import com.cucumber.utils.AccountData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountSteps 
{
	BaseClass base;
	AccountPage account;
	AccountData data;
	
	
	@Given("^Launch the url$")
	public void launch_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  base = new BaseClass();
			base.initialization();
	}

	@When("^click on the account$")
	public void click_on_the_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    account = new AccountPage();
	    account.AccountCreate();
	}

	@When("^enter the details for register$")
	public void enter_the_details_for_register() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		account = new AccountPage();
		data = new AccountData();
		account.enterDetails(data.fname(), data.lname(), data.email(), data.confemail(), data.passwd(), data.confpasswd());
	}

	@Then("^click on register$")
	public void click_on_register() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		account = new AccountPage();
		account.createacc();
		base.Close();
	}


}
