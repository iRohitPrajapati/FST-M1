#Author: your.email@your.domain.com

@activity2_5
Feature: Login Test

Scenario Outline: Testing Login with Example
	  Given User is on Login page
    When User enters "<Usernames>" and "<Passwords>"
    Then Read the page title
    And Read confirmation message
    And Close the browser
    
Examples:
|Usernames|Passwords|
|admin    |password |
|adminUser|Password |