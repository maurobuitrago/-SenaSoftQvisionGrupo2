Feature: Login
  as a user who has an account in the bon bonite application
  I wish to log in to the application to be able to make online purchases.
  @CP_003_Login_Successful
  Scenario Outline: Login successful
    Given that the user is in the login and registration section
    When user enters valid credentials
      | document_number | <document_number> |
      | password        | <password>        |
    Then the user should see your username
      | document_number | <document_number> |
    Examples:
      | document_number | password        |
      | 1000973176      | Colombia654734  |
      | 1000973114      | millonarios2020 |