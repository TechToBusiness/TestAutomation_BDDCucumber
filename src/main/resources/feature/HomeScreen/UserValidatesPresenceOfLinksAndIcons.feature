@linkvalidation
@smokelevel1
Feature: User launches the home page and validate the presence of Links and Icons on the Home Page

  Background: User needs to launch Home page
   # Given The Home page is launched

  Scenario Outline: User validates icons presence
    Then User validates that <elementType> <elementName> is present on Home page

    Examples:
    |  elementType  |  elementName  |
    |  Link         |     Women     |
    #|  Link         |     Dresses     |
    #|  Link         |     T-Shirts     |
    |  Link         |     Popular     |
    |  Link         |     Best Sellers     |


  Scenario Outline: User clicks on each link and comes back to home page
    Then User clicks on <elementName> link
    Then User clicks on My Store Logo

    Examples:
      |  elementType  |  elementName  |
      |  Link         |     Women     |
      #|  Link         |     Dresses     |
      #|  Link         |     T-Shirts     |
      |  Link         |     Popular     |
      |  Link         |     Best Sellers     |

    Scenario: User close the browser
      #Given User close the browser