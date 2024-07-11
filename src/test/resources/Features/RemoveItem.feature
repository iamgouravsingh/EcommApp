Feature: Remove added item from cart
  Scenario: User want remove product from cart
    Given User is on landing screen
    When User click on Search field and enter perfume
    And Click on subcategory Men
    And Click on Search
    Then Application navigates to Item Detail screen
    When User click on Add to Cart
    Then Application redirects to Cart Page
    When user click on remove
    Then Item get removed from cart