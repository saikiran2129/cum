Feature: login functional flow

  @Sanity
  
  Scenario: login with valid credentials
    Given User able to open the browser
    And User able to enter the url
    When User able to enter the username
    And User able to enter the password
    And User able to click on the submit button
    Then verify the login is successful
    And verify the homescreen