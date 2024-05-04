Feature: Products Details Page 

    @Smoke
    Scenario: TC:06- Verify that the user is able to add the lowest price product to the cart by selecting the add to cart button in Products page
    Given Launch the application
    Then User checks if the login page contents are displayed properly
    When Enter the username and password and click login
    Then Check the Products title are displayed
    Then Check the Products Names are displayed correctly
      | Sauce Labs Backpack      |
      | Sauce Labs Bolt T-Shirt  |
      | Sauce Labs Bike Light    |
      | Sauce Labs Fleece Jacket |
      | Sauce Labs Onesie        |
    And User selects the products sort dropdown option "text" "Price (low to high)"
    Then Check that the product prices are sorted based on the user selection in the products dropdown "Low to High"
    And User clicks on the Add Cart button On the Products page "0"
    Then Check if the Add to Cart button has changed to the Remove button after clicking the Add to Cart button "0"
    Then Verify that the cart icon displays the count of products added to the cart "1" 
    And Logout the Application
    
    
    Scenario: TC:07- Verify that the user is able to add the highest price product to the cart by selecting the add to cart button in the Products page
    Given Launch the application
    Then User checks if the login page contents are displayed properly
    When Enter the username and password and click login
    Then Check the Products title are displayed
    Then Check the Products Names are displayed correctly
      | Sauce Labs Backpack      |
      | Sauce Labs Bolt T-Shirt  |
      | Sauce Labs Bike Light    |
      | Sauce Labs Fleece Jacket |
      | Sauce Labs Onesie        |
    And User selects the products sort dropdown option "text" "Price (high to low)"
    Then Check that the product prices are sorted based on the user selection in the products dropdown "High to Low"
    And User clicks on the Add Cart button On the Products page "0"
    Then Check if the Add to Cart button has changed to the Remove button after clicking the Add to Cart button "0"
    Then Verify that the cart icon displays the count of products added to the cart "1" 
    And Logout the Application
    

    Scenario:TC:08 Verify that the user is able to add multiple products to the cart
    Given Launch the application
    Then User checks if the login page contents are displayed properly
    When Enter the username and password and click login
    Then Check the Products title are displayed
    Then Check the Products Names are displayed correctly
      | Sauce Labs Backpack      |
      | Sauce Labs Bolt T-Shirt  |
      | Sauce Labs Bike Light    |
      | Sauce Labs Fleece Jacket |
      | Sauce Labs Onesie        |
    And User clicks on the Add Cart button On the Products page "2"
    Then Check if the Add to Cart button has changed to the Remove button after clicking the Add to Cart button "0"
    Then Verify that the cart icon displays the count of products added to the cart "1" 
    And User clicks on the Add Cart button On the Products page "4"
    Then Check if the Add to Cart button has changed to the Remove button after clicking the Add to Cart button "1"
    Then Verify that the cart icon displays the count of products added to the cart "2" 
    And Logout the Application
    
    
    
    
    
    
    
    
    