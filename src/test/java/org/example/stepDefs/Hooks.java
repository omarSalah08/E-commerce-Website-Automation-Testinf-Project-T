package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;


    @Before
    public static void open_Browser()
    {
        //1- define bridge
        WebDriverManager.chromedriver().setup();

        //2- new object from chromedriver
        driver = new ChromeDriver();

        //3- configrations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //4- navigate to the website
        driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @After
    public static void close_Browser() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.quit();
    }
}
