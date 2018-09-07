#Author: lucmarin@bancolombia.com.co

@demo
Feature: Register user demo
  I want to use this form for save a user

  @HappyRoute
  Scenario: register user full
    Given that Carlos want into to the web Automation Demo Site
    When the does the register in the page
    Then  the verify that view the screen with text Double Click on Edit Icon to EDIT the Table Row
    
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
