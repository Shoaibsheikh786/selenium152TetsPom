@reg @mytag
Feature: login featue 
Scenario Outline: To verify we are not able to login with valid crede.

Given open the chrome
When user enters "https://practice.expandtesting.com/login"
And user enters username as <username>
And user enters password as <password>
And user clicks on login button 
Then user can see the logout button
Then close the driver
Examples:
|username|password|
|"admin1"|"pass1"|
|"admin2"|"pass2"|
|"admin3"|"pass3"|








