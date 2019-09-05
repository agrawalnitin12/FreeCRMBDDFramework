Feature: Deal Data creation 

Scenario: Create a new contact scenario

Given user is already on login page
When title of login page is free crm
Then user enters username and password
|nitin_1206|LGsoft123|
Then user clicks on login button
Then user is on home page
Then user moves to Deal Page
Then user enters deal details 
|test deal|1000|50|10|
Then close the browser 