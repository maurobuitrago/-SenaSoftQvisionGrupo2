Feature: Update Information
  I, as a user/customer of the Bon-Bonite website, would like to update my account information.

  Scenario Outline: Update Credentials Successfully
    Given that the user is in the login and registration section
    When user enters valid credentials
      | document_number | <document_number> |
      | password        | <password>        |
    Given that the user is in the details account section  my account
    When user enters valid credentials in the section form
      | FirstName            | <FirstName>       |
      | LastName             | <LastName>        |
      | CurrentPassword      | <CurrentPassword> |
      | NewPassword          | <NewPassword>     |
      | ConfirmedNewPassword | <ConfirmedNewPassword>     |
    Then the user should see your username
      | document_number | <document_number> |
    Examples:
      | document_number | password       | FirstName | LastName | CurrentPassword | NewPassword     | ConfirmedNewPassword |
      | 1000973176      | Colombia654734 | Yenner    | Alayon   | millonarios2020 | millonarios2021 | millonarios2021      |


