package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef {

    P01_register registration = new P01_register();

    @Given("user navigate to register page")
    public void goRegisterPage()
    {
        registration.navigateToRegister().click();
    }

    @When("user select gender type")
    public void selectGender()
    {
        registration.selectGender().click();
    }

    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void names(String firstName, String lastName)
    {
        registration.namesEnter(firstName, lastName);
    }

    @And("user select date of birth")
    public void birthDate()
    {
        Select select = new Select(registration.birthDay());
        select.selectByIndex(18);

        select = new Select(registration.birthMonth());
        select.selectByVisibleText("November");

        select = new Select(registration.birthYear());
        select.selectByValue("1996");
    }

    @And("^user enter email \"(.*)\"$")
    public void e_mail(String email)
    {
        registration.emailEnter(email);
    }

    @When("^user fills Password fields \"(.*)\" and \"(.*)\"$")
    public void passwords(String password, String confirmPassword)
    {
        registration.passwordsEnter(password, confirmPassword);
    }

    @Then("user clicks on register button")
    public void clickRegister()
    {
        registration.registerButton().click();
    }

    @And("user successfully register and success message is displayed")
    public void registrationSuccess()
    {
        // ** Soft Assertion ** //
        SoftAssert softAssert =new SoftAssert();

        // First Assertion
        softAssert.assertTrue(registration.successMessage().isDisplayed(), "Success message appears");

        // Second Assertion
        String expectedColor = "rgba(76, 177, 124, 1)";
        String actualColor = registration.successMessage().getCssValue("color");
        softAssert.assertEquals(actualColor,expectedColor, "Success message color is correct");

        // All Assert
        softAssert.assertAll();

    }
}
