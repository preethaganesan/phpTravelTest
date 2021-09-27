#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: PHP Payment Verification
Background:
Given that the user is able to open PHP web page


Scenario Outline: Verify PHP Payment is sucessful
Given User is able to login to php
Then Verify User is able to see the welcome page
And User navigates to Add Funds
And User chooses the Payment Method "<PaymentMethod>"
Then User completes the payment using "<PaymentMethod>" sucessfully
And User logs out of php

Examples:
|PaymentMethod|
|PayPal				|
