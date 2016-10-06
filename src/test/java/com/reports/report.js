$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fooddishes.feature");
formatter.feature({
  "line": 1,
  "name": "Food Dishes",
  "description": "",
  "id": "food-dishes",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3988366,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I am on food \"broccoli\" page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iAmLoggedIn()"
});
formatter.result({
  "duration": 9707921870,
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
  "duration": 1804736411,
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
  "duration": 57976895,
  "status": "passed"
});
formatter.match({
  "location": "FoodIngredientsSteps.iShouldSeeFoodCaption()"
});
formatter.result({
  "duration": 62284302,
  "status": "passed"
});
formatter.match({
  "location": "FoodIngredientsSteps.iShouldSeeFoodAuthor()"
});
formatter.result({
  "duration": 52855241,
  "status": "passed"
});
formatter.after({
  "duration": 162395991,
  "status": "passed"
});
formatter.before({
  "duration": 55726,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I am on food \"broccoli\" page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iAmLoggedIn()"
});
