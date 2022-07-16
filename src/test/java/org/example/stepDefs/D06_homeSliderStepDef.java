package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class D06_homeSliderStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user clicks on the first slider")
    public void clickFirstSlider() throws InterruptedException
    {
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        homePage.firstSliderSelector().click();
        homePage.slider("1").click();
        Thread.sleep(2000);
    }

    @Then("users browser is navigated to first slider product page")
    public void firstSliderPage()
    {
        // ** Hard Assertion ** //
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @When("user clicks on the second slider")
    public void clickSecondSlider() throws InterruptedException
    {
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        homePage.secondSliderSelector().click();
        homePage.slider("2").click();
        Thread.sleep(2000);
    }

    @Then("users browser is navigated to second slider product page")
    public void secondSliderPage()
    {
        // ** Hard Assertion ** //
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");
    }


}
