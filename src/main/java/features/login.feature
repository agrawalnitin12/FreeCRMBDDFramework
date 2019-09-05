Feature: Free CRM Login Feature

#Scenario: Free CRM Login Test Scenario

#Given user is already on login page 
#When title of login page is free crm
#Then user enters "nitin_1206" and "LGsoft123"
#Then user clicks on login button 
#Then user is on home page

#Scenario: user is able to create a new contact
#Given user is already on home page
#When user mouse hover on contacts link
#Then user clicks on new contact link
#Then user enters firstname and lastname 
#Then user clicks on save button 
#Then verify new contact created

Scenario Outline: Free CRM Login Test Scenario

Given user is already on login page
When title of login page is free crm
Then user enters "<username>" and "<password>"  
Then user clicks on login button 
Then user is on home page
Then close the browser

Examples: 
       |username   | password  |
       |nitin_1206 | LGsoft123 |
       |tom        | test123   |
