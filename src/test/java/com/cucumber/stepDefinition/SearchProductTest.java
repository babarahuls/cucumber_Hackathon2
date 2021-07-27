package com.cucumber.stepDefinition;

import com.cucumber.base.BaseClass;
import com.cucumber.pages.LoginPage;
import com.cucumber.pages.SearchProduct;
import com.cucumber.utils.LoginData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchProductTest 
{
	BaseClass base;
	SearchProduct sp;
	LoginPage login;
	LoginData log;
	
	@Given("^User navigates to the URL$")
	public void user_navigates_to_the_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		base = new BaseClass();
		base.initialization();
	}

	@Then("^User able in login$")
	public void user_able_in_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login = new LoginPage();
	    log = new LoginData();
	    login.loginDetails(log.uid(), log.credpass());
	    login.submit();
	}

	@Then("^search the product$")
	public void search_the_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		sp=new SearchProduct();
		sp.search();
		sp.Close();
	}
}
