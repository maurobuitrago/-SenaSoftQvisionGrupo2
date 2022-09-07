Feature: View Product
  as a user of the bon bonite application,
  I would like to see the product information
  to know the characteristics of this product.

  Scenario Outline: Correct display of product information
    Given that the user is in the products section
    When select a product
    Then the user should see the product information
      | product_name | <product_name> |
      | ref          | <ref>          |


    Examples:
      | product_name                           |
      | Baletas de tacón color blanco en cuero |