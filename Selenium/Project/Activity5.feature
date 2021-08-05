#Author: your.email@your.domain.com

@activity5
Feature: Navigate to another page

  @tag1
  Scenario Outline: Verify the website title
    Given User is on LMS page
    When User locates "<linkName>" item in navigation bar and click
    Then Get page title and verify "<linkName>"
    And Close the Browser
    
    Examples:
    | linkName |
    | My Account |
