#Author
#Date
#Description
Feature: feature to test login fucntionality

  Scenario: Check login successfull with valid credentials
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to home page
