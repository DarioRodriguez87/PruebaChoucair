#Autor: Dario Rodriguez
@stories
Feature: Academy Choucair
  As a user, I want to learnhow to automate in screemplay at the Choucair Academy with the automation curse

  @scenario1
    Scenario Outline: Search for a automation course
    Given than Dario wants to learn automation at the academy choucair
      |strUser | strPassword |
      |<strUser> | <strPassword> |
    When he search for the course on the Chouxair Academy platform
      | strCourse |
      | <strCourse> |
    Then he finds the course called
      |strCourse|
      | <strCourse> |
    Examples:
      | strUser | strPassword | strCourse |
      | 10523081920|Choucair2021*|Automatizacion bancolombia|