package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class D08_wishlistStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user adds an item to wishlist")
    public void addWishlist()
    {
        homePage.addWishlist().get(2).click();
    }

    @Then("success message of adding item is displayed")
    public void addSuccessMessage()
    {
        // ** Soft Assertion ** //
        SoftAssert softAssert = new SoftAssert();

        // First Assertion
        softAssert.assertTrue(homePage.wishlistSuccessMessage().isDisplayed());

        // Second Assertion
        String expectedColor = "rgba(75, 176, 122, 1)";
        String actualColor = homePage.wishlistSuccessMessage().getCssValue("background-color");
        softAssert.assertEquals(actualColor, expectedColor);
    }

    @And("the number of wishlist increased")
    public void numberOfWishlistIncrease()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String text = homePage.wishlistItemsNumber().getText().replaceAll("[^0-9]", "");
        int numberOfItems = Integer.parseInt(text);

        // ** Hard Assertion ** //
        Assert.assertTrue(numberOfItems > 0);
    }
}
