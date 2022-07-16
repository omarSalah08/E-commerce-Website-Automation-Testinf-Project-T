@smoke
  Feature: F05_HoverCategories | user can hover categories and select one of them or a sub-category
    Scenario: user hover categories and select one
      When user hover categories and select one or select a sub-category
      And user click on category or sub-category
      Then users browser is navigated to relative product page
