Feature: Application Login


Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with "jin" and "1234"
Then home page is populated
And Cards displayed are "true"


Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with "john" and "4321"
Then home page is populated
And Cards displayed are "false"