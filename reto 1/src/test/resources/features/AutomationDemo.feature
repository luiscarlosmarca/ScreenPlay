#Author: lucmarin@bancolombia.com.co

@demo
Feature: Register user demo
  I want to use this form for save a user

  @HappyRoute
  Scenario: register user full
    Given that Carlos want into to the web Automation Demo Site
    When the does the register in the page
			|fullname|lastname|address|email|phone|gender|hobbies|languages|skills|country|dept|year|month|day|password|password_confirm|
			|luiscarlos|marin campos|cr 79 n 32- 2 |lucmarin@bancolombia.com|3022342343|male|Movies|English|CSS|China|Japan|1994|May|11|secret|secret|
 Then  the verify that view the screen with text Double Click on Edit Icon to EDIT the Table Row
 
 
#Data códigos de producto

