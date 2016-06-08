package com.bbcingredients.steps;


import com.bbcingredients.pageobjects.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;


public class HomePageSteps {

    WebDriver driver = new FirefoxDriver();
    HomePage homePage = new HomePage(driver);

    @Given("^I am on food \"([^\"]*)\" page$")
    public void iAmOnFoodPage(String arg1) throws Throwable {
        homePage.navigateToFoodPage();
    }

    @Then("^I should see food image$")
    public void iShouldSeeFoodImage() throws Throwable {
        assertTrue(homePage.foodImage.isDisplayed());
    }

    @Then("^I should see food caption$")
    public void iShouldSeeFoodCaption() throws Throwable {
        assertTrue(homePage.foodCaption.isDisplayed());
    }

    @Then("^I should see food author$")
    public void iShouldSeeFoodAuthor() throws Throwable {
        assertTrue(homePage.foodAuthor.isDisplayed());
    }

    @Then("^I should see first accordion open$")
    public void iShouldSeeFirstAccordionOpen() throws Throwable {
        assertThat(homePage.accordionHeader.getAttribute("class"), containsString("open"));
    }

    @When("^I click second accordion$")
    public void iClickSecondAccordion() throws Throwable {
        homePage.secondAccordionHeader.click();
    }

    @Then("^I should see accordion content$")
    public void iShouldSeeAccordionContent() throws Throwable {
        homePage.waitForContent();
        assertTrue(homePage.accordionImage.isDisplayed());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
