@Login

Feature: Login to HRMS

  @loginSuccess
  Scenario: Login success
    Given  I go to website
    When I enter username and password
    And I click on button Login
    Then I login successfully

