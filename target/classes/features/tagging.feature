@FunctionalTest
Feature: Free CRM Application Testing

@SmokeTest @RegressionTest
Scenario: login with correct username & correct password 
Given This is valid login test

@RegressionTest
Scenario: login with Incorrect username & correct password 
Given This is Invalid login test

@SmokeTest
Scenario: create a contact
Given This is contact test case

@SmokeTest @RegressionTest
Scenario: create a deal
Given This is deal test case

@RegressionTest
Scenario: create a task
Given This is task test case

@SmokeTest
Scenario: create a case
Given This is case test case

@SmokeTest
Scenario: verify left panel links
Given clicking on left panel links

@SmokeTest
Scenario: search a deal
Given This is search deal test

@SmokeTest
Scenario: search a contact
Given This is search contact test

@SmokeTest @RegressionTest
Scenario: search a case
Given This is search case test

@SmokeTest @RegressionTest
Scenario: search a task
Given This is search task test

@SmokeTest @End2EndTest
Scenario: search a call
Given This is search call test

@End2EndTest
Scenario: search a email
Given This is search email test

@End2EndTest
Scenario: search a docs
Given This is search docs test

@End2EndTest
Scenario: search a forms
Given This is search forms test

@SmokeTest @End2EndTest
Scenario: validate a report
Given This is report test

@End2EndTest
Scenario: Application logout
Given This is a logout test

Scenario: browser closed
Given This is close browser test
