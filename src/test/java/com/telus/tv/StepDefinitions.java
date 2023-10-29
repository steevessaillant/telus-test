package com.telus.tv;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    private WebDriver driver;
    private TelusTVPage telusTVPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        telusTVPage = new TelusTVPage(driver);
    }

    @Given("I am on the TELUS TV+ website")
    public void iAmOnTheTELUSTVWebsite() {
        telusTVPage.openPage("https://telustvplus.com/#/");
    }

    @When("I close the welcome popup")
    public void iCloseTheWelcomePopup() {
        TelusTVPage telusTVPage = new TelusTVPage(driver);
        telusTVPage.closeWelcomePopup();
    }

    @And("I click on {string}")
    public void iClickOn(String linkText) {
        telusTVPage.clickLinkByText(linkText);
    }

    // Continue to refactor other step definitions...

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @And("I scroll to the {string} section")
    public void iScrollToTheSection(String text) {
        telusTVPage.scrollToAndClickMovies();
    }


    @And("I click on the {string} button")
    public void iClickOnTheButton(String text) {
        telusTVPage.clickFilterButton();
    }

    @And("I select {string} from the filter options")
    public void iSelectFromTheFilterOptions(String text) {
        telusTVPage.selectFilterOption(text);
    }

    @And("I click the {string} button")
    public void iClickTheButton(String text) {
        telusTVPage.clickApplyButton();
    }


    @Then("I should find an asset with a rating of {string} and click on the asset to open the details page")
    public void iShouldFindAnAssetWithARatingOfAndClickOnTheAssetToOpenTheDetailsPage(String rating) {
        telusTVPage.findAssetWithRatingAndClick(rating);
        // Now you should be on the details page
    }

}
