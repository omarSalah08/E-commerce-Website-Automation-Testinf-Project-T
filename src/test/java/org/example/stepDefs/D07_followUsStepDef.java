package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user opens Facebook link")
    public void openFacebook()
    {
        homePage.facebookIcon().click();
    }


    @When("user opens Twitter link")
    public void openTwitter()
    {
        homePage.twitterIcon().click();
    }


    @When("user opens rss link")
    public void openRSS()
    {
        homePage.rssIcon().click();
    }


    @When("user opens YouTube link")
    public void openYouTube()
    {
        homePage.youTubeIcon().click();
    }

    @Then("^\"([^\"]*)\" is opened in new tab$")
    public void navigateToLink(String link) throws InterruptedException
    {
        Thread.sleep(4000);

        ArrayList<String> openedTaps = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(openedTaps.get(1));

        Thread.sleep(8000);

        // ** Hard Assertion ** //
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), link);

        Hooks.driver.close();
        Hooks.driver.switchTo().window(openedTaps.get(0));
        Thread.sleep(500);

    }


}
