Feature: Automation practice form

  Scenario Outline: Submit Form with multiple values
    Given Launch https://demoqa.com/automation-practice-form URL
    When Verify Student Registration Form Header
    Then Enter Values "<firstName>" "<lastName>" "<Email>" "<Mobile>" "<Subjects>"

    Examples: 
      | firstName | lastName | Email        | Mobile    | Subjects |
      | syed      | taher    | s1@gmail.com | 777889923 | Java     |
      | sam       | tom      | s2@gmail.com | 889435562 | Phython  |
      | oggy      | jack     | s3@gmail.com | 902355632 | JS       |
