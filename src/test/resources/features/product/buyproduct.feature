Feature: Buy Product

  Scenario Outline: Buy product successful
    Given that the user is in the login and registration section
    When user enters valid credentials
      | document_number | <document_number> |
      | password        | <password>        |
    Given that the user is in the shoes products section
    When add products to the shopping cart
    And enter your billing information
      | first_name      | <first_name>      |
      | last_name       | <last_name>       |
      | gender          | <gender>          |
      | document_number | <document_number> |
      | phone           | <phone>           |
      | country         | <country>         |
    Then the user should see the products to be purchased
      | product_name | <product_name> |
    Examples:
      | document_number | password       | first_name | last_name  | gender | phone     | country   | product_name                                                 |
      | 1000973176      | Colombia654734 | pedro      | picapiedra | hombre | 434362547 | venezuela |Baletas en cuero color verde esmeralda y animal print - 35.5 |