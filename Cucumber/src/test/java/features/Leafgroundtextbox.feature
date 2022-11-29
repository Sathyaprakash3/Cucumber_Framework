#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@autosuggestion
Feature: To Perform autosuggestion

  @tag3
  Scenario Outline: To perform autosuggestion on Leafground
    Given Go to dashboard bage in leafground
    When I click element in menu
    And I click textbox in submenu
    And Give values <textvalue> in the search
    Then I validate the autosuggestive label


    Examples: 
      | textvalue  |
      | india      |
      | user       |
