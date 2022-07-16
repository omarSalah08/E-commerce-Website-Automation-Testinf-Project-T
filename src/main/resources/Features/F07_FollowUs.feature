@smoke
  Feature: F07_FollowUs | user can open followUs links
    Scenario: user opens Facebook link
      When user opens Facebook link
      Then "https://www.facebook.com/nopCommerce" is opened in new tab

    Scenario: user opens Twitter link
      When user opens Twitter link
      Then "https://twitter.com/nopCommerce" is opened in new tab

    Scenario: user opens rss link
      When user opens rss link
      Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

    Scenario: user opens YouTube link
      When user opens YouTube link
      Then "https://www.youtube.com/user/nopCommerce" is opened in new tab