
Feature: Title of your feature



Scenario: Lanch
Given Launch the url
When click on the account 
And enter the details for register
Then click on register



Scenario: Login 
Given Launch the browser
When enter the username and password
Then click on continue



#
#
#
#
#



#
#
#
#
#
#

Scenario: TC009 Verify user is able to login Live chat by entering valid credentials
Given User enters the URL
Given User able to click on live chat 
When user able to enter name and valid email Id  
Then User able to click on submit


Scenario: searchproduct
Given User navigates to the URL
Then User able in login
And search the product

Scenario: Logout
Given Launch the website
When enter uname and password for logout
Then click on myaccount and logout




