Feature: Compose Functionality

Scenario Outline: Compose Function in Gmail Application

Given the user navigates to Gmail application
When user enter Email Id as "<email>" then click on Next Button
When user enter Password as "<password>" then click on Next Button

And I click Compose Button in Gmail Home Page
When I Enter Email Id as "<to>" in To textbox
When I Enter Subject as "<subject>" in Subject textbox
When I Enter "<messageBody>" to Message Body textbox
And I click on Send Button

Examples:
|email                 |password    |to                  |subject  |messageBody|
|sk2687045@gmail.com   |suresh@123  |sk2687045@gmail.com |Incubyte |Automation QA test for Incubyte|




