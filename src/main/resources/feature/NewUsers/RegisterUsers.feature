@createuser
@smokelevel2
Feature: Register new user and validating login credential

    Background: User navigates to homepage
       # Given The Home page is launched

    Scenario: User registering on the website
        Given User clicks on Login button
        Then User finds a page with title 'Login - My Store' is displayed
        And User validates that button Create an account is present on Login page

    Scenario Outline: User creates multiple new accounts
        Given User finds a page with title 'Login - My Store' is displayed
        When User finds '<email_id>' is available
        Then User enters values for new user with '<email_id>' from '<sheet_name>' of input excel 'CreateUsers.xlsx' present in 'CreateUser' folder
        Examples:
        |  email_id      |  sheet_name  |
        |  user111@aa.com  |  demouser1   |
        |  user2@bb.com  |  demouser2   |
        |  user3@cc.com  |  demouser3   |

    Scenario: User closed the browser
       # Given User close the browser