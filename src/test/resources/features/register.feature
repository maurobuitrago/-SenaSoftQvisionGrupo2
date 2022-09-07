Feature: Register
  as a bon bonite customer I would like to have an account in the application
  to be able to make purchases in the bon bonite online store.

  @CP_001_Register_Successful
  Scenario Outline: Register Successful
    Given that the user is in the login and registration section
    When the customer completes the registration process with his data
      | document_number | <document_number> |
      | email           | <email>           |
      | password        | <password>        |
    Then the user should see your username
      | document_number | <document_number> |
    Examples:
      | document_number | email                        | password        |
      | 1000973176      | gonzalojime3245@gmail.com    | Colombia654734  |
      | 1000963288      | tatisrodriguez4521@gmail.com | Argentina654734 |
      | 1000953389      | manololopez6789@gmail.com    | Peru654734      |
      | 1000923154      | juangomes9070@gmail.com      | Bolivia654734   |

  @CP_002_Register_Unsatisfactory
  Scenario Outline: Register unsatisfactory
    Given that the user is in the login and registration section
    When the customer completes the registration process with his data
      | document_number | <document_number> |
      | email           | <email>           |
      | password        | <password>        |
    Then customer should see error message and registration form
      | lbl_error         | <lbl_error>         |
      | lbl_register_form | <lbl_register_form> |

    Examples:
      | document_number | email                     | password       | lbl_error | lbl_register_form |
      | 1000973176      | gonzalojime3245@gmail.com | Colombia654734 | Error:    | registrarse       |
