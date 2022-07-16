@smoke
  Feature: F06_HomeSlider | user can open the sliders page
    Scenario: first slider "Nokia" is clickable
      When user clicks on the first slider
      Then users browser is navigated to first slider product page

    Scenario: second slider "Iphone" is clickable
      When user clicks on the second slider
      Then users browser is navigated to second slider product page
