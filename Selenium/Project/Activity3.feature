#Author: your.email@your.domain.com

@activity3
Feature: Website, info box title

  @tag1
  Scenario: Verify the title of the first info box
    Given User is on LMS page
    When Get 1 info box title and verify result is "Actionable Training"
    Then Close the Browser

