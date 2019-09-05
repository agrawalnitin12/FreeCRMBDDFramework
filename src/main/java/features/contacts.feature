Feature: Free CRM contact feature

Scenario Outline: Create a new contact scenario

Given user is already on login page
When title of login page is free crm
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page 
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser 

Examples: 
	|username |password|firstname|lastname|position |
	|nitin_1206|LGsoft123|Nitin|Agrawal|Engineer|
	|nitin_1206|LGsoft123|tom|peter|Manager|