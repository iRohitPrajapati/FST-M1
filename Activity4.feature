#Author: your.email@your.domain.com

@activity4
Feature: Verify the title of the second most popular course

  @tag1
  Scenario: Read the title of the second most popular course on the website and verify the text
    Given User is on LMS page
    When User get 2 popular course and verify result is "Email Marketing Strategies"
    Then Close the Browser
