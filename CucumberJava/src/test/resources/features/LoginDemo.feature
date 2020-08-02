Feature: Test Login Functionality
Scenario Outline: Check login is successful with Valid credentials
Given browser is open
And user is on login page
When user enters <username> and <password>
And User clicks on login
Then user is navigated to homepage


Examples:

    |username|password|
    |Raghav |12345|
    |Ele    |12345|