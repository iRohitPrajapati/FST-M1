#Author: your.email@your.domain.com

@activity9
Feature: Complete a simple lesson

  @tag1
  Scenario Outline: Navigate to a particular lesson and complete it
    Given User is on LMS page
    When User locates "<linkName>" item in navigation bar and click
    Then Get page title and verify "<linkName>"
    And Select any course and open it
    And Login with username "root" and password "pa$$w0rd" to verify progress
    And If status is not complete, mark it complete
    Then Close the Browser
    
    Examples:
    |linkName|
    |All Courses|
