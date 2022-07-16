@smoke
  Feature: F04_Search | user can search for an item by different keywords

    Scenario Outline: user can search by product name
      Given user click on search bar
      When user enter the product "<name>"
      And user click on search button
      Then user search success and browser is navigated to products page

    Examples:
      |name|
      |Nikon|
      |Apple|
      |Book|


    Scenario Outline: user can search by SKU
      Given user click on search bar
      When user enter the product "<name>"
      And user click on search button
      And user click on the product in search result
      Then user search success and browser is navigated to exact product page

      Examples:
        |name|
        |HP_SPX_UB|
        |SM_900_PU|


    Scenario Outline: user can search by invalid product name
      Given user click on search bar
      When user enter the product "<name>"
      And user click on search button
      Then user can't find the product

      Examples:
        |name|
        |dell|
        |canon|