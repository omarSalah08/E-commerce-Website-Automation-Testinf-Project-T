package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P04_search;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class D04_searchStepDef {

    P03_homePage homePage = new P03_homePage();
    P04_search search =new P04_search();
    private String nameOfProduct;

    @Given("user click on search bar")
    public void searchBar()
    {
        homePage.searchBar().click();
    }

    @When("^user enter the product \"([^\"]*)\"$")
    public void enterProductName(String productName)
    {
        homePage.productNameEnter(productName);
        nameOfProduct = productName;
    }

    @And("user click on the product in search result")
    public void selectProduct()
    {
        search.productSelection().click();
    }

    @And("user click on search button")
    public void clickSearch()
    {
        homePage.searchButton().click();
    }

    @Then("user search success and browser is navigated to products page")
    public void navigateToProducts()
    {
        // ** Soft Assertion ** //
        SoftAssert softAssert = new SoftAssert();

        // First Assertion
        softAssert.assertTrue(homePage.searchURL().contains("https://demo.nopcommerce.com/search?q="));

        // Second Assertion
        int size = search.searchProductsList().size();
        for(int i=0;i<size;i++)
        {
            String actualResult = search.productName().getText();
            String expectedResult = nameOfProduct;
            softAssert.assertTrue(actualResult.contains(expectedResult));
        }

        // All Assert
        softAssert.assertAll();
    }

    @Then("user search success and browser is navigated to exact product page")
    public void navigateToProduct()
    {
        // ** Hard Assertion ** //
        String actualSKU = search.getSKU().getText();
        String expectedSKU = nameOfProduct;
        Assert.assertTrue(actualSKU.contains(expectedSKU));
    }

    @Then("user can't find the product")
    public void productNotFound()
    {
        // ** Hard Assertion ** //
        Assert.assertTrue(search.notFoundMessage().isDisplayed());

    }
}
