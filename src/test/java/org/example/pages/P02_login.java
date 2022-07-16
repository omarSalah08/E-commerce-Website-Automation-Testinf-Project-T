package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement navigateToLogin()
    {
        WebElement loginIcon = Hooks.driver.findElement(By.className("ico-login"));
        return loginIcon;
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

    public void loginDataEnter(String email, String password)
    {
        email().clear();
        email().sendKeys(email);

        password().clear();
        password().sendKeys(password);
    }

    public WebElement loginButton()
    {
        WebElement button = Hooks.driver.findElement(By.className("login-button"));
        return button;
    }

    public WebElement myAccountIcon()
    {
        WebElement myAccountIcon = Hooks.driver.findElement(By.className("ico-account"));
        return myAccountIcon;
    }

    public WebElement failMessage()
    {
        WebElement message = Hooks.driver.findElement(By.className("message-error"));
        return message;
    }

}
