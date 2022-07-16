package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_search {
    public List<WebElement> searchProductsList()
    {
        List<WebElement> list = Hooks.driver.findElements(By.className("item-grid"));
        return list;
    }

    public WebElement productName()
    {
        WebElement name = Hooks.driver.findElement(By.cssSelector("h2[class=\"product-title\"]"));
        return name;
    }

    public WebElement productSelection()
    {
        WebElement select = Hooks.driver.findElement(By.cssSelector("div[class=\"picture\"]"));
        return select;
    }

    public WebElement getSKU()
    {
        WebElement sku = Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]"));
        return sku;
    }

    public WebElement notFoundMessage()
    {
        WebElement message = Hooks.driver.findElement(By.cssSelector("div[class=\"no-result\"]"));
        return message;
    }
}
