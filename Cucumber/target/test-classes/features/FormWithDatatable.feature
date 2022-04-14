Feature: Automation practice form

  Scenario: Submit Form with multiple values
    Given Launch https://demoqa.com/automation-practice-form URL
    When Verify Student Registration Form Header
    Then Enter Values in Form
      | FirstName | syed         |
      | LastName  | taher        |
      | EmailID   | s1@gmail.com |
      | MobileNo  |    777889923 |
      | Subjects  | Java         |

