@smoke
  Feature: F01_Register | users could register with new accounts
    Scenario: user could register with valid data successfully
      Given user navigate to register page
      When user select gender type
      And user enter first name "Omar" and last name "Salah"
      And user select date of birth
      And user enter email "osalah0811@gmail.com"
      And user fills Password fields "123pass" and "123pass"
      Then user clicks on register button
      And user successfully register and success message is displayed
