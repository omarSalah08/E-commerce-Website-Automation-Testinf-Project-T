package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P03_homePage {

    public WebElement currencies()
    {
        WebElement currency = Hooks.driver.findElement(By.id("customerCurrency"));
        return currency;
    }

    public WebElement euroCurrency()
    {
        WebElement euro = Hooks.driver.findElement(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
        return euro;
    }

    public WebElement productPrice()
    {
        WebElement price = Hooks.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
        return price;
    }

    public List<WebElement> products()
    {
        List<WebElement> list = Hooks.driver.findElements(By.className("home-page-product-grid"));
        return list;
    }

    public WebElement searchBar()
    {
        WebElement bar = Hooks.driver.findElement(By.id("small-searchterms"));
        return bar;
    }

    public void productNameEnter(String name)
    {
        searchBar().clear();
        searchBar().sendKeys(name);
    }

    public WebElement searchButton()
    {
        WebElement searchButton = Hooks.driver.findElement(By.className("search-box-button"));
        return searchButton;
    }

    public String searchURL()
    {
        String url = Hooks.driver.getCurrentUrl();
        return url;
    }

    public List<WebElement> categoriesList()
    {
        List<WebElement> categoriesList = new ArrayList<>();
        categoriesList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]")));
        categoriesList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]")));
        categoriesList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]")));
        categoriesList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/digital-downloads\"]")));
        categoriesList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/books\"]")));
        categoriesList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/jewelry\"]")));
        categoriesList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/gift-cards\"]")));
        return categoriesList;
    }

    public List<WebElement> computers_Sub_Categories_List()
    {
        List<WebElement> computersList = new ArrayList<>();
        computersList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/desktops\"]")));
        computersList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/notebooks\"]")));
        computersList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/software\"]")));

        return computersList;
    }

    public List<WebElement> electronics_Sub_Categories_List()
    {
        List<WebElement> electronicsList = new ArrayList<>();
        electronicsList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/camera-photo\"]")));
        electronicsList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/cell-phones\"]")));
        electronicsList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/others\"]")));

        return electronicsList;
    }

    public List<WebElement> apparel_Sub_Categories_List()
    {
        List<WebElement> apparelList = new ArrayList<>();
        apparelList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/shoes\"]")));
        apparelList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/clothing\"]")));
        apparelList.add(Hooks.driver.findElement(By.cssSelector("a[href=\"/accessories\"]")));

        return apparelList;
    }

    public WebElement firstSliderSelector()
    {
        WebElement firstSelector = Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]"));
        return firstSelector;
    }

    public WebElement secondSliderSelector()
    {
        WebElement secondSelector = Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]"));
        return secondSelector;
    }

    public WebElement slider(String sliderNumber)
    {
        WebElement slider = Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNumber+"]"));
        return slider;
    }

    public WebElement facebookIcon()
    {
        WebElement facebook = Hooks.driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));
        return facebook;
    }

    public WebElement twitterIcon()
    {
        WebElement twitter = Hooks.driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]"));
        return twitter;
    }

    public WebElement rssIcon()
    {
        WebElement rss = Hooks.driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));
        return rss;
    }

    public WebElement youTubeIcon()
    {
        WebElement youTube = Hooks.driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
        return youTube;
    }

    public List<WebElement> addWishlist()
    {
        List<WebElement> wishlist = Hooks.driver.findElements(By.className("add-to-wishlist-button"));
        return wishlist;
    }

    public WebElement wishlistSuccessMessage()
    {
        WebElement wishlistMessage = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
        return wishlistMessage;
    }

    public WebElement wishlistItemsNumber()
    {
        WebElement number = Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]"));
        return number;
    }
}
