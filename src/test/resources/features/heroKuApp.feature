Feature: Test the Login functinality of HeroKuApp

@smoke
  Scenario Outline: Check Login working with Valid credentials
    Given Open the browser now
    And Navigate to the Login Page
    When Enter the <email> and <password>
    And Hit Login Button
    Then User is on Home page

    Examples: 
      | email    | password             |
      | tomsmith | SuperSecretPassword! |
