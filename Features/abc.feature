@smoke @reg
Feature: serach functionality 

Background:
Given open the chrome
When user enters "https://practice.expandtesting.com/login"


Scenario: This is my test 1

And user enters username as "myUsenme"
And user enters password as "myPasswrod"
And user clicks on login button 
Then user can see the logout button
Then close the driver

Scenario: This is my test 2

And user enters username as "myuser2"
And user enters password as "myPasswrod2"
And user clicks on login button 
Then user can see the logout button
Then close the driver

Scenario: This is my test 2

And user enters username as "myUsenme"
And user enters password as "myPasswrod2"
And user clicks on login button 
Then user can see the logout button
Then close the driver


