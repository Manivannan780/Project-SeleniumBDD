Feature: Products Page 

  Scenario: TC01-Check that all the expected page contents are displayed in the Products Page
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
    Then Check the Page title and other elements are displayed
    And Logout the Application
    
    
    Scenario: TC02-Check that the user is able to sort the list of products by using the product sort dropdown - Products Name Ascending Order A to Z
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
    Then Check the Page title and other elements are displayed
    And User selects the products sort dropdown option "text" "Name (A to Z)"
    Then Check that the product names are sorted based on the user selection in the products dropdown "A to Z"
    And Logout the Application
    
    
    Scenario: TC03-Check that the user is able to sort the list of products by using the product sort dropdown - Products Name Descending Order Z to A
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
    Then Check the Page title and other elements are displayed
    And User selects the products sort dropdown option "text" "Name (Z to A)"
    Then Check that the product names are sorted based on the user selection in the products dropdown "Z to A"
    And Logout the Application
    
    
    Scenario: TC04-Check that the user is able to sort the list of products by using the product sort dropdown - Products High to Low price
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
    Then Check the Page title and other elements are displayed
    And User selects the products sort dropdown option "text" "Price (high to low)"
    Then Check that the product prices are sorted based on the user selection in the products dropdown "High to Low"
    And Logout the Application
    
    
    
    Scenario: TC05- Check that the user is able to sort the list of products by using the product sort dropdown - Products Low to High price
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
    Then Check the Page title and other elements are displayed
    And User selects the products sort dropdown option "text" "Price (low to high)"
    Then Check that the product prices are sorted based on the user selection in the products dropdown "Low to High"
    And Logout the Application
    
    
    
    #Scenario: Verify that the user is able to add the product to the cart by selecting the add to cart button in Products page
    #Given Launch the application
    #Then User checks if the login page contents are displayed properly
    #When Enter the username and password and click login
    #And User clicks on the Add to Cart button
    #Then Verify that the cart icon displays the count of products added to the cart
    #And Logout the Application
    #Scenario: Verify that the user is able to add the product to the cart by selecting the add to cart button in the Products Details page
    #Given Launch the application
    #Then User checks if the login page contents are displayed properly
    #When Enter the username and password and click login
    #And User navigates to the corresponding product and selects product name
    #Then verify that the product details page displays all the expected page contents
    #And User clicks on the Add to Cart button
    #Then Verify that the cart icon displays the count of products added to the cart
    #And Logout the Application
