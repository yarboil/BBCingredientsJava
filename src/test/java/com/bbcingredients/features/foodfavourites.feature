Feature: Food Favourites

  As a user
  I want to view food favourites
  So I can remember recipes

  Background:
    Given I am logged in
    And I am on recipe page
    And I add to favourites
    And I click to view favourites

  Scenario: Add to favourites
    Then I should see recipe in favourites

  Scenario: Remove from favourites
    When I remove from favourites
    Then I should see add to favourites button
