Feature: Login

Scenario: Login by using valid credentials

Given browser is open
When  application is displayed
When user clicks on login link
When  use enters valid credentials
When   user clicks on login button
Then user must be successfully logged in
Then  browser closes