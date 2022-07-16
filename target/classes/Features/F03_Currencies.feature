@smoke
  Feature: F03_Currencies | user can select the currency $ or €
    Scenario: user can change the currency from $ to €
      When user select Euro from currency list
      Then all $ sings change to € signs