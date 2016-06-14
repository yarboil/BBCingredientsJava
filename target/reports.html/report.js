$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/bbcingredients/fooddishes.feature");
formatter.feature({
  "line": 2,
  "name": "Food Dishes",
  "description": "",
  "id": "food-dishes",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on food \"broccoli\" page",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "broccoli",
      "offset": 14
    }
  ],
  "location": "FoodIngredientsSteps.iAmOnFoodPage(String)"
});
formatter.result({
  "duration": 7035226526,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Food Information displayed",
  "description": "",
  "id": "food-dishes;food-information-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I should see food image",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see food caption",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should see food author",
  "keyword": "And "
});
formatter.match({
  "location": "FoodIngredientsSteps.iShouldSeeFoodImage()"
});
formatter.result({
  "duration": 79160065,
  "status": "passed"
});
formatter.match({
  "location": "FoodIngredientsSteps.iShouldSeeFoodCaption()"
});
formatter.result({
  "duration": 28469501,
  "status": "passed"
});
formatter.match({
  "location": "FoodIngredientsSteps.iShouldSeeFoodAuthor()"
});
formatter.result({
  "duration": 30665420,
  "status": "passed"
});
formatter.after({
  "duration": 3007990846,
  "status": "passed"
});
formatter.after({
  "duration": 2589415703,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on food \"broccoli\" page",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "broccoli",
      "offset": 14
    }
  ],
  "location": "FoodIngredientsSteps.iAmOnFoodPage(String)"
});
formatter.result({
  "duration": 4512824535,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Recipes accordion",
  "description": "",
  "id": "food-dishes;recipes-accordion",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I should see first accordion open",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click second accordion",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should see accordion content",
  "keyword": "Then "
});
formatter.match({
  "location": "FoodIngredientsSteps.iShouldSeeFirstAccordionOpen()"
});
formatter.result({
  "duration": 75766186,
  "status": "passed"
});
formatter.match({
  "location": "FoodIngredientsSteps.iClickSecondAccordion()"
});
formatter.result({
  "duration": 212673143,
  "status": "passed"
});
formatter.match({
  "location": "FoodIngredientsSteps.iShouldSeeAccordionContent()"
});
formatter.result({
  "duration": 293783250,
  "status": "passed"
});
formatter.after({
  "duration": 2896718111,
  "status": "passed"
});
formatter.after({
  "duration": 2318973651,
  "status": "passed"
});
});