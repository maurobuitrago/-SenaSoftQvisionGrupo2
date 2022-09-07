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
      | document_number | password       |
      | 1000973176      | Colombia654734 |

  @CP_004_Login_Unsatisfactory
  Scenario Outline:
    Given that the user is in the login and registration section
    When user enters invalid credentials
      | document_number | <document_number> |
      | password        | <password>        |
    Then customer should see error message login form
      | lbl_error      | <lbl_error>      |
      | lbl_login_form | <lbl_login_form> |
    Examples:
      | document_number | password           | lbl_error | lbl_login_form |
      | 105673fg176     | Coldfddfmbia654734 | Error     | acceder        |
      | 1005673114      | millofdfarios2020  | Error     | acceder        |

  @CP_031_Logout_Successful
  Scenario Outline: Logout successful
    Given that the user is in the login and registration section
    When user enters valid credentials
      | document_number | <document_number> |
      | password        | <password>        |
    And user logs out
    Then the user should see the login and registration section
      | lbl_login    | <lbl_login>    |
      | lbl_register | <lbl_register> |
    Examples:
      | document_number | password       | lbl_login | lbl_register |
      | 1000973176      | Colombia654734 | acceder   | registrarse   |