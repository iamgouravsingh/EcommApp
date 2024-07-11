Feature: Select Item through search
  Scenario: User want add product by searching a product
    Given User is on landing screen
    When User click on Search field and enter perfume
    And Click on subcategory Men
    And Click on Search
    Then Application navigates to Item Detail screen
    When User click on Add to Cart
    Then Application redirects to Cart Page

#Feature: Select Item through menu option
 # Scenario: User want add product through menu option
  #  Given User is on landing screen
   # When User click on menu option
    #And Click on item add to cart
    #Then Application redirects to Cart Page