@login
@smokelevel1
Feature: User logins to application, validate the home page and logs out

  Background: User launches the home page
    #Given The Home page is launched  -- commenting as i implemented before

  Scenario: User is able to login to the application
    Given User clicks on Login button
    Then User finds a page with title 'Login - My Store' is displayed
    Then User logs in the application by entering 'testuser202103@gmail.com' and 'Newuser@123'
    And User finds a page with title 'My Account - My Store' is displayed
    Then User clicks on UserAccount link
    #Then user clicks on 'Link' with text 'Test User'
    Then User finds a page with title 'My account - My Store' is displayed
    Then User clicks on Logout link
    #Then User close the browser -- commenting as I implemented after


