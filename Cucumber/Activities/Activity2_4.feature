#Author: your.email@your.domain.com

@activity2_4
Feature: Login Test

Scenario: Testing Login without Examples
    Given User is on Login page
    When User enters "admin" and "password"
    Then Read the page title
    And  Read confirmation message
    And Close the Browser
