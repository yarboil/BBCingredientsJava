$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/bbcingredients/foodrecipes.feature");
formatter.feature({
  "line": 1,
  "name": "Food Recipes",
  "description": "",
  "id": "food-recipes",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2888813794,
  "status": "passed"
});
formatter.before({
  "duration": 84672,
  "status": "passed"
});
formatter.before({
  "duration": 16950204011,
  "status": "passed"
});
formatter.before({
  "duration": 86466,
  "status": "passed"
});
formatter.before({
  "duration": 44011,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Add to favourites",
  "description": "",
  "id": "food-recipes;add-to-favourites",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I am on Food recipe page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click add to favourites",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.iAmLoggedIn()"
});
formatter.result({
  "duration": 15984487209,
  "status": "passed"
});
formatter.match({
  "location": "FoodRecipesSteps.iAmOnFoodSearch()"
});
formatter.result({
  "duration": 40151306,
  "status": "passed"
});
formatter.match({
  "location": "FoodRecipesSteps.iClickAddToFavourites()"
});
formatter.result({
  "duration": 7739702409,
  "status": "passed"
});
formatter.after({
  "duration": 159380370,
  "status": "passed"
});
formatter.after({
  "duration": 2536359087,
  "status": "passed"
});
formatter.after({
  "duration": 2347358568,
  "status": "passed"
});
});