Feature: Shopping Cart
  I as a user/customer of the bon bonite application wish
  to add and remove products from the shopping cart
  so that in any case my action can be reversed.


  Scenario Outline: Successfully add products from the shopping cart
    Given that the user is in the login and registration section
    When user enters valid credentials
      | document_number | <document_number> |
      | password        | <password>        |
    Given that the user is in the shoes products section
    When add products to the shopping cart
    Then the user should see the products in the shopping cart
      | product_name | <product_name> |
    Examples:
      | document_number | password       | product_name                                                 |
      | 1000973176      | Colombia654734 | Baletas en cuero color verde esmeralda y animal print - 35.5 |

