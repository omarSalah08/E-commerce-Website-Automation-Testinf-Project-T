@smoke
  Feature: F02_Login | user could use login functionality

    Scenario: user can login with a valid email and password
      Given user navigate to login page
      When user enter "osalah0811@gmail.com" and "123pass"
      And user press login button
      Then user login successfully


    Scenario: user can't login with invalid email and password
      Given user navigate to login page
      When user enter "omarsalah@gmail.com" and "123password"
      And user press login button
      Then user can't login
