Feature: Login functionality of salesforce 
Scenario: Login with valid credentials and navigate to Accounts 
Given Launch browser and load URL 
And Enter username and password 
When Click on the login button 
Then It should navigate to the next page 
	
When Click on toggle menu button from the left corner 
And Click view All and click Sales from App Launcher 
And Click on Accounts tab 
And Click on New button 
Then New account page should be displayed 
	
When Enter 'Sivaranjani' as account name 
And Select Ownership as Public 
And Click save 
Then Account name should be Sivaranjani 
	
	
 