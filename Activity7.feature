#Author: your.email@your.domain.com

@activity7
Feature: Count the number of courses

  @tag1
  Scenario Outline: Navigate to the “All Courses” page and count the number of courses
    Given User is on LMS page
    When User locates "<linkName>" item in navigation bar and click
    Then Get page title and verify "<linkName>"
    And Find all cources on the page and print
    And Close the Browser
    
    Examples:
    |linkName|
    |All Courses|