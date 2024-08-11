Feature: Validate the new user add and removeal functionality

  Scenario: Login into the application with valid credentials 
  	Given Navigate to way2automation site
  	When  Create a new user 
    Then  validate the newly user account
    Then  validate the deletion of new user accont 
