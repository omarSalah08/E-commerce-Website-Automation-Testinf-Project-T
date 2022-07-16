package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P05_category;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef {
    P03_homePage homePage = new P03_homePage();
    P05_category category = new P05_category();
     private int selectedCategory;
     private int selectedSub_Category;
     private String categoryName;

    @When("user hover categories and select one or select a sub-category")
    public void hoverCategories()
    {
        Actions action =new Actions(Hooks.driver);

        int listSize = homePage.categoriesList().size(); // 7
        int min = 0;
        int max = listSize -1;
        selectedCategory = (int)Math.floor(Math.random()*(max-min+1)+min);

        action.moveToElement(homePage.categoriesList().get(selectedCategory)).perform();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (selectedCategory==0 || selectedCategory==1 || selectedCategory==2)
        {
            switch (selectedCategory)
            {

                case 0:
                    selectedSub_Category = (int) Math.floor(Math.random() * (2 - 0 + 1) + 0);
                    action.moveToElement(homePage.computers_Sub_Categories_List().get(selectedSub_Category)).perform();
                    categoryName = homePage.computers_Sub_Categories_List().get(selectedSub_Category).getText().toLowerCase();
                    break;

                case 1:
                    selectedSub_Category = (int) Math.floor(Math.random() * (2 - 0 + 1) + 0);
                    action.moveToElement(homePage.electronics_Sub_Categories_List().get(selectedSub_Category)).perform();
                    categoryName = homePage.electronics_Sub_Categories_List().get(selectedSub_Category).getText().toLowerCase();
                    break;

                case 2:
                    selectedSub_Category = (int) Math.floor(Math.random() * (2 - 0 + 1) + 0);
                    action.moveToElement(homePage.apparel_Sub_Categories_List().get(selectedSub_Category)).perform();
                    categoryName = homePage.apparel_Sub_Categories_List().get(selectedSub_Category).getText().toLowerCase();
                    break;
            }
        }

        else if (selectedCategory==3 || selectedCategory==4 || selectedCategory==5 || selectedCategory==6)
        {
            categoryName = homePage.categoriesList().get(selectedCategory).getText().toLowerCase();
        }




    }

    @And("user click on category or sub-category")
    public void choose()
    {
        if (selectedCategory==0 || selectedCategory==1 || selectedCategory==2)
        {
            switch (selectedCategory)
            {

                case 0:
                    homePage.computers_Sub_Categories_List().get(selectedSub_Category).click();
                    break;

                case 1:
                   homePage.electronics_Sub_Categories_List().get(selectedSub_Category).click();
                    break;

                case 2:
                    homePage.apparel_Sub_Categories_List().get(selectedSub_Category).click();
                    break;
            }
        }
        else if (selectedCategory==3 || selectedCategory==4 || selectedCategory==5 || selectedCategory==6)
        {
            homePage.categoriesList().get(selectedCategory).click();
        }
    }

    @Then("users browser is navigated to relative product page")
    public void navigateToProductPage()
    {
        // ** Hard Assertion ** //
        Assert.assertEquals(category.categoryTitle().getText().toLowerCase(),categoryName);
    }
}
