$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fooddishes.feature");
formatter.feature({
  "line": 1,
  "name": "Food Dishes",
  "description": "",
  "id": "food-dishes",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15922476,
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
  "duration": 2970578386,
  "error_message": "org.openqa.selenium.WebDriverException: [browserstack.local] is set to true but local testing through BrowserStack is not connected. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.46 seconds\nBuild info: version: \u00272.52.0\u0027, revision: \u00274c2593cfc3689a7fcd7be52549167e5ccc93ad28\u0027, time: \u00272016-02-11 11:22:43\u0027\nSystem info: host: \u0027Lionels-MacBook-Pro.local\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.6\u0027, java.version: \u00271.8.0_71\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:249)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:158)\n\tat com.bbcingredients.features.support.helper.DriverFactory.createNewDriverInstance(DriverFactory.java:30)\n\tat com.bbcingredients.features.support.helper.DriverFactory.getDriver(DriverFactory.java:42)\n\tat com.bbcingredients.features.steps.LoginPageSteps.iAmLoggedIn(LoginPageSteps.java:12)\n\tat ✽.Given I am logged in(fooddishes.feature:4)\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "FoodIngredientsSteps.iShouldSeeFoodCaption()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FoodIngredientsSteps.iShouldSeeFoodAuthor()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 327194,
  "error_message": "java.lang.NullPointerException\n\tat com.bbcingredients.features.support.helper.DriverFactory.destroyDriver(DriverFactory.java:48)\n\tat com.bbcingredients.features.steps.FoodRecipesSteps.tearDown(FoodRecipesSteps.java:58)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:234)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:74)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)\n",
  "status": "failed"
});
formatter.before({
  "duration": 131285,
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
  "duration": 730034882,
  "error_message": "org.openqa.selenium.WebDriverException: [browserstack.local] is set to true but local testing through BrowserStack is not connected. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 712 milliseconds\nBuild info: version: \u00272.52.0\u0027, revision: \u00274c2593cfc3689a7fcd7be52549167e5ccc93ad28\u0027, time: \u00272016-02-11 11:22:43\u0027\nSystem info: host: \u0027Lionels-MacBook-Pro.local\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.6\u0027, java.version: \u00271.8.0_71\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:249)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:158)\n\tat com.bbcingredients.features.support.helper.DriverFactory.createNewDriverInstance(DriverFactory.java:30)\n\tat com.bbcingredients.features.support.helper.DriverFactory.getDriver(DriverFactory.java:42)\n\tat com.bbcingredients.features.steps.LoginPageSteps.iAmLoggedIn(LoginPageSteps.java:12)\n\tat ✽.Given I am logged in(fooddishes.feature:4)\n",
  "status": "failed"
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
  "status": "skipped"
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
formatter.match({
  "location": "FoodIngredientsSteps.iShouldSeeFirstAccordionOpen()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 323091,
  "error_message": "java.lang.NullPointerException\n\tat com.bbcingredients.features.support.helper.DriverFactory.destroyDriver(DriverFactory.java:48)\n\tat com.bbcingredients.features.steps.FoodRecipesSteps.tearDown(FoodRecipesSteps.java:58)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:234)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:74)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)\n",
  "status": "failed"
});
formatter.uri("foodfavourites.feature");
formatter.feature({
  "line": 1,
  "name": "Food Favourites",
  "description": "\nAs a user\nI want to view food favourites\nSo I can remember recipes",
  "id": "food-favourites",
  "keyword": "Feature"
});
formatter.before({
  "duration": 81933,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I am on recipe page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I add to favourites",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click to view favourites",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iAmLoggedIn()"
});
formatter.result({
  "duration": 745354758,
  "error_message": "org.openqa.selenium.WebDriverException: [browserstack.local] is set to true but local testing through BrowserStack is not connected. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 734 milliseconds\nBuild info: version: \u00272.52.0\u0027, revision: \u00274c2593cfc3689a7fcd7be52549167e5ccc93ad28\u0027, time: \u00272016-02-11 11:22:43\u0027\nSystem info: host: \u0027Lionels-MacBook-Pro.local\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.6\u0027, java.version: \u00271.8.0_71\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:249)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:158)\n\tat com.bbcingredients.features.support.helper.DriverFactory.createNewDriverInstance(DriverFactory.java:30)\n\tat com.bbcingredients.features.support.helper.DriverFactory.getDriver(DriverFactory.java:42)\n\tat com.bbcingredients.features.steps.LoginPageSteps.iAmLoggedIn(LoginPageSteps.java:12)\n\tat ✽.Given I am logged in(foodfavourites.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "location": "FoodRecipesSteps.iAmOnFoodSearch()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FoodRecipesSteps.iClickAddToFavourites()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FoodRecipesSteps.iClickToViewFavourites()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "Add to favourites",
  "description": "",
  "id": "food-favourites;add-to-favourites",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I should see recipe in favourites",
  "keyword": "Then "
});
formatter.match({
  "location": "YourFavouritesSteps.iShouldSeeRecipeInFavourites()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 539188,
  "error_message": "java.lang.NullPointerException\n\tat com.bbcingredients.features.support.helper.DriverFactory.destroyDriver(DriverFactory.java:48)\n\tat com.bbcingredients.features.steps.FoodRecipesSteps.tearDown(FoodRecipesSteps.java:58)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:234)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:74)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)\n",
  "status": "failed"
});
formatter.before({
  "duration": 133524,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I am on recipe page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I add to favourites",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click to view favourites",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iAmLoggedIn()"
});
formatter.result({
  "duration": 758882383,
  "error_message": "org.openqa.selenium.WebDriverException: [browserstack.local] is set to true but local testing through BrowserStack is not connected. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 744 milliseconds\nBuild info: version: \u00272.52.0\u0027, revision: \u00274c2593cfc3689a7fcd7be52549167e5ccc93ad28\u0027, time: \u00272016-02-11 11:22:43\u0027\nSystem info: host: \u0027Lionels-MacBook-Pro.local\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.6\u0027, java.version: \u00271.8.0_71\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:249)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:158)\n\tat com.bbcingredients.features.support.helper.DriverFactory.createNewDriverInstance(DriverFactory.java:30)\n\tat com.bbcingredients.features.support.helper.DriverFactory.getDriver(DriverFactory.java:42)\n\tat com.bbcingredients.features.steps.LoginPageSteps.iAmLoggedIn(LoginPageSteps.java:12)\n\tat ✽.Given I am logged in(foodfavourites.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "location": "FoodRecipesSteps.iAmOnFoodSearch()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FoodRecipesSteps.iClickAddToFavourites()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FoodRecipesSteps.iClickToViewFavourites()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "Remove from favourites",
  "description": "",
  "id": "food-favourites;remove-from-favourites",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I remove from favourites",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I should see add to favourites button",
  "keyword": "Then "
});
formatter.match({
  "location": "YourFavouritesSteps.iRemoveFromFavourites()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "YourFavouritesSteps.iShouldSeeAddToFavouritesButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 457092,
  "error_message": "java.lang.NullPointerException\n\tat com.bbcingredients.features.support.helper.DriverFactory.destroyDriver(DriverFactory.java:48)\n\tat com.bbcingredients.features.steps.FoodRecipesSteps.tearDown(FoodRecipesSteps.java:58)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:234)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:74)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)\n",
  "status": "failed"
});
formatter.uri("foodrecipes.feature");
formatter.feature({
  "line": 1,
  "name": "Food Recipes",
  "description": "\nAs a user\nI want to see food recipes\nSo I can make a decision on recipes",
  "id": "food-recipes",
  "keyword": "Feature"
});
formatter.before({
  "duration": 113311,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I am on recipe page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iAmLoggedIn()"
});
