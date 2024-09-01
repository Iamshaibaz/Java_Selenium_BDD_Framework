Feature: Login Functionality for OpenCart E-Commerce Website


As a user of the OpenCart website
I want to be able to log in with my account
So that i can access my account-related features and manage my orders

Background:
Given I am on the OpenCart login page

Scenario:
Given I have enter a valid username and password
When I click on the login button
Then I should be logged in successfully

Scenario Outline: Unsuccessful login with invalid or empty credentials 
Given I have entered invalid "<username>" and "<password>"
When I click on the login button 
Then I should see an error message indicating "<error_message>"

Scenario Outline: Check login successfull with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And click on login button
    Then user is navigated to home page

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |


