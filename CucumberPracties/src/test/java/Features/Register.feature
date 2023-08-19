Feature: Register

Scenario: Register to the application with a valid credentials

Given browser is open
When   application is displayed
Then click on Register link
And enter all the valid credential and click on submit button
Then goto login page and enter valid username and password and click on login
And Check user is able to logged in