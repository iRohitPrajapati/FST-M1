#Author: your.email@your.domain.com

@activity8
Feature: Alchemy LMS

  @tag1
  Scenario Outline: Verify the website title
    Given User is on LMS page
   	When User locates "<linkName>" item in navigation bar and click
    Then Get page title and verify "<linkName>"
    And Find the contact form fields
    And Fill in the information and leave a message
    And Read and print the message after submission
    Then Close the Browser
    
    Examples:
    |linkName|
    |Contact|
    
