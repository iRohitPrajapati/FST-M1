#Author: your.email@your.domain.com

@activity1
Feature: Application Title

  @tag1
  Scenario: Verify the website title
    Given User is on LMS page
    When Get page title
    And Verify title
    Then Close the Browser
