Feature: Login functionality of Leaftaps application

Background:
Given Launch the browser
And Load the url

Scenario: Login with positive credentials and verify
Given Enter the username as 'Demosalesmanager' and password as 'crmsfa'
When Click on the Login button
Then HomePage should be displayed

Scenario: Login with invalid credentials and verify
Given Enter the username as 'Demosale' and password as 'crms'
When Click on the Login button
But ErrorMessage should be displayed