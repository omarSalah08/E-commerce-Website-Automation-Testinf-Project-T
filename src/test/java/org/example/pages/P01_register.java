package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {

    public WebElement navigateToRegister()
    {
        WebElement registerIcon = Hooks.driver.findElement(By.className("ico-register"));
        return registerIcon;
    }

    public WebElement selectGender()
    {
        WebElement gender = Hooks.driver.findElement(By.id("gender-male"));
        return gender;
    }

    public WebElement firstName()
    {
        WebElement firstName = Hooks.driver.findElement(By.id("FirstName"));
        return firstName;
    }

    public WebElement lastName()
    {
        WebElement lastName = Hooks.driver.findElement(By.id("LastName"));
        return lastName;
    }

    public WebElement email()
    {
        WebElement email = Hooks.driver.findElement(By.id("Email"));
        return email;
    }

    public WebElement password()
    {
        WebElement password = Hooks.driver.findElement(By.id("Password"));
        return password;
    }

    public WebElement confirmPassword()
    {
        WebElement confirmPassword = Hooks.driver.findElement(By.id("ConfirmPassword"));
        return confirmPassword;
    }

    public void namesEnter(String firstName, String lastName)
    {
        firstName().clear();
        firstName().sendKeys(firstName);

        lastName().clear();
        lastName().sendKeys(lastName);
    }

    public void emailEnter(String email)
    {
        email().clear();
        email().sendKeys(email);
    }

    public void passwordsEnter(String password, String confirmPassword)
    {
        password().clear();
        password().sendKeys(password);

        confirmPassword().clear();
        confirmPassword().sendKeys(confirmPassword);
    }

    public WebElement birthDay()
    {
        WebElement day = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        return day;
    }

    public WebElement birthMonth()
    {
        WebElement month = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        return month;
    }

    public WebElement birthYear()
    {
        WebElement year = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return year;
    }

    public WebElement registerButton()
    {
        WebElement button = Hooks.driver.findElement(By.id("register-button"));
        return button;
    }

    public WebElement successMessage()
    {
        WebElement message = Hooks.driver.findElement(By.className("result"));
        return message;
    }
}
