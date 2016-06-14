Feature: Login Page

  As a user
  I want to view the page
  So I can login into the site

  Scenario: Login
    Given I am on signin page
    When I enter "username" and "password"
    And I click signin
    And I click continue
    Then I should be signed in
