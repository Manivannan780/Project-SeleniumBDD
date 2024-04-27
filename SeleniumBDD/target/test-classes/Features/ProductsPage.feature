Feature: Check all the expected page contents are displayed in the Products Page

  Scenario: Title of your scenario
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
