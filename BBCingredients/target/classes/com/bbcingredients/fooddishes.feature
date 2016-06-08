Feature: Food Dishes

  Background:
    Given I am on food "broccoli" page

  Scenario: Food Information displayed
    Then I should see food image
    And I should see food caption
    And I should see food author

  Scenario: Recipes accordion
    Then I should see first accordion open
    When I click second accordion
    Then I should see accordion content