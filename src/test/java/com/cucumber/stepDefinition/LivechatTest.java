package com.cucumber.stepDefinition;

import com.cucumber.base.BaseClass;
import com.cucumber.pages.LoginLiveChat;
import com.cucumber.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LivechatTest 
{
	BaseClass base;
	LoginLiveChat loginlive;
	
	@Given("^User enters the URL$")
	public void user_enters_the_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		base = new BaseClass();
		base.initialization();
	}

	@Given("^User able to click on live chat$")
	public void user_able_to_click_on_live_chat() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  loginlive= new LoginLiveChat();
	  loginlive.livechat();
	  
	}

	@When("^user able to enter name and valid email Id$")
	public void user_able_to_enter_name_and_valid_email_Id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginlive.enterDetails();
	}

	@Then("^User able to click on submit$")
	public void user_able_to_click_on_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginlive.Close();
	}
}
