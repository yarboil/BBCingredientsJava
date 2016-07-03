Feature: Food Dishes

  @browser
  Scenario: Food Information displayed
    Given I am on a desktop
    And I am on food "broccoli" page
    Then I should see food image
    And I should see food caption
    And I should see food author

  @mobile
  Scenario: Mobile food information displayed
    Given I am on a mobile device
    And I am on food "broccoli" page
    Then I should see mobile food image
    And I should see mobile food caption
    And I should see mobile food author

  @browser
  Scenario: Recipes accordion
    Given I am on a desktop
    And I am on food "broccoli" page
    Then I should see first accordion open
    When I click second accordion
    Then I should see accordion content
    