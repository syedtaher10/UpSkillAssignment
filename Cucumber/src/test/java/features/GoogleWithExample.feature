Feature: Google Search

  Scenario Outline: To type text in search bar
    Given To launch the google browser
    When The search bar is visible
    Then Enter the text "<yourText>"

    Examples: 
      | yourText |
      | syed     |
      | IBM      |
      | Cucumber |
