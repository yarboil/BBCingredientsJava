Feature: Food Recipes

  As a user
  I want to see food recipes
  So I can make a decision on recipes

  Background:
    Given I am logged in
    And I am on recipe page

  Scenario: Ingredients list
    Then I should see ingredients list

  Scenario: Method list
    Then I should see method list

  Scenario: Find a recipe
    When I search for a recipe
    Then I should see recipes containing recipe

  Scenario: Add to favourites
    And I add to favourites
    When I click to view favourites
    Then I should see recipe in favourites
