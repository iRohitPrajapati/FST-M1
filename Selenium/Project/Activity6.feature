#Author: your.email@your.domain.com

@activity6
Feature: Logging into the site

  @tag1
  Scenario Outline: Open the website and log-in using the provided credentials
    Given User is on LMS page
    When User locates "<linkName>" item in navigation bar and click
    Then Get page title and verify "<linkName>"
    When User enters username "root" and password "pa$$w0rd"
    And Click login button to login
    Then Verify user logsin successfully
    And Close the Browser
    
    Examples:
    |linkName|
    |My Account|