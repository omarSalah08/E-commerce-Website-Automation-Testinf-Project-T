package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login = new P02_login();

    @Given("user navigate to login page")
    public void goLoginPage()
    {
        login.navigateToLogin().click();
    }

    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void validData(String email, String password)
    {
        login.loginDataEnter(email, password);
    }

    @And("user press login button")
    public void clickLogin()
    {
        login.loginButton().click();
    }

    @Then("user login successfully")
    public void loginSuccess()
    {
        // ** Soft Assertion ** //
        SoftAssert softAssert =new SoftAssert();

        // First Assertion
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");

        // Second Assertion
        softAssert.assertTrue(login.myAccountIcon().isDisplayed(), "Login success");

        // All Assert
        softAssert.assertAll();
    }

    @Then("user can't login")
    public void loginFailed()
    {
        // ** Soft Assertion ** //
        SoftAssert softAssert =new SoftAssert();

        // First Assertion
        softAssert.assertTrue(login.failMessage().isDisplayed(), "Fail message appears");

        // Second Assertion
        String expectedColor = "rgba(228, 67, 75, 1)";
        String actualColor = login.failMessage().getCssValue("color");
        softAssert.assertEquals(actualColor,expectedColor, "Fail message color is correct");

        // All Assert
        softAssert.assertAll();
    }
}
