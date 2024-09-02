Feature: Testing Facebook Page Login

Scenario: Checking login fucntionality

Given browser is open
And Facebook page should be open
When Enter email and password
And Hit login
Then Validate facebook home page