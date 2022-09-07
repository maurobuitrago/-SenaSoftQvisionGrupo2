Feature: Favorite Product
  as a user of the application
  I would like to be able to add products to the wish
  list in order to be able to share the list through networks.

  @CP_027_FAVORITE_PRODUCT
  Scenario Outline: successfully add product to wish list
    Given that the user is in the login and registration section
    When user enters valid credentials
      | document_number | <document_number> |
      | password        | <password>        |
    Given that the user is viewing a product
    When the user adds the product to the list of desired products
    Then the user should see the product added in the product wish list section
    Examples:
      | document_number | password       |
      | 1000973176      | Colombia654734 |
