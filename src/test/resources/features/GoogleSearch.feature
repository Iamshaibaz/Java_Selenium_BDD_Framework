Feature: Check Google Search Engine Functionality

  Scenario: Validate google search is working
    Given Browser is open
    And user is on google search page
    When user enter text in google search field
    And hits enter
    Then Search result should be displayed
