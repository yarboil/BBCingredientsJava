Feature: Food Recipes

  Scenario: Food recipe finder
    Given I am on Food recipe page
    When I click quick recipe finder first checkbox
    And I click search
    And I am on food search page
    And I click first filter in search results
    When I click first checkbox recipe
    Then I should see recipe in results

  Scenario: Add to favourites
    Given I am logged in
    And I am on Food recipe page
    When I click add to favourites
    Then I should see "Added to favourites"
    When I click your favourites button
    Then I should see recipe in favourites

  Scenario: Remove from favourites
    Given I am logged in
    And I am on Food recipe page
    When I click add to favourites
    Then I should see "Added to favourites"
    When I click your favourites button
    And I click cross button
    And I click remove button
    Then I should see add to favourites button

  Scenario: Shopping List
    Given I am on Food recipe page
    And I have ingredients list
    When I navigate to shopping list
    Then I should see ingredients list displayed

