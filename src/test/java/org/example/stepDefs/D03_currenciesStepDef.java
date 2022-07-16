package org.example.stepDefs;

import io.cucumber.java.en.When;
import io.cucumber.java.lv.Tad;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D03_currenciesStepDef {

    P03_homePage homePage = new P03_homePage();

    @When("user select Euro from currency list")
    public void selectEuro()
    {
        homePage.currencies().click();
        homePage.euroCurrency().click();
    }

    @Tad("all $ sings change to € signs")
    public void singsChanged()
    {
        int listSize = homePage.products().size();
        for (int i=0;i<listSize;i++)
        {
            String actualPrice = homePage.productPrice().getText();
            // ** Hard Assertion ** //
            Assert.assertTrue(actualPrice.contains("€"));
        }

    }
}
