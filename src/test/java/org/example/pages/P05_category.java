package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_category {
    public WebElement categoryTitle()
    {
        WebElement title = Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
        return title;
    }
}
