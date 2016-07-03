$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fooddishes.feature");
formatter.feature({
  "line": 1,
  "name": "Food Dishes",
  "description": "",
  "id": "food-dishes",
  "keyword": "Feature"
});
formatter.before({
  "duration": 34403869546,
  "status": "passed"
});
formatter.before({
  "duration": 72961,
  "status": "passed"
});
formatter.before({
  "duration": 66672,
  "status": "passed"
});
formatter.before({
  "duration": 80815,
  "status": "passed"
});
formatter.before({
  "duration": 501626,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Mobile food information displayed",
  "description": "",
  "id": "food-dishes;mobile-food-information-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@mobile"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am on a mobile device",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I am on food \"broccoli\" page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see mobile food image",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I should see mobile food caption",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see mobile food author",
  "keyword": "And "
});
formatter.match({
  "location": "FoodIngredientsSteps.iAmOnAMobileDevice()"
});
formatter.result({
  "duration": 122730747,
  "status": "passed"
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
  "duration": 90987704439,
  "status": "passed"
});
formatter.match({
  "location": "FoodIngredientsSteps.iShouldSeeMobileFoodImage()"
});
formatter.result({
  "duration": 7523694581,
  "status": "passed"
});
formatter.match({
  "location": "FoodIngredientsSteps.iShouldSeeMobileFoodCaption()"
});
formatter.result({
  "duration": 2429163874,
  "status": "passed"
});
formatter.match({
  "location": "FoodIngredientsSteps.iShouldSeeMobileFoodAuthor()"
});
formatter.result({
  "duration": 1144618923,
  "status": "passed"
});
formatter.after({
  "duration": 3329294560,
  "status": "passed"
});
formatter.after({
  "duration": 35696391587,
  "status": "passed"
});
formatter.after({
  "duration": 37355661428,
  "status": "passed"
});
});