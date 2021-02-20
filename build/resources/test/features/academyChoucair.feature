# Autor: Natalia
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than natalia want to learn automation at the academy choucair
      | strUser    | strPassword   |
      | 1091665680 | Choucair2021* |
    When she search for the course on the choucair academy platform
      | strCourse                  |
      | Prueba Técnica - Analista Bancolombia |
    Then she finds the course called
      | strCourse                  |
      | Prueba Técnica - Analista Bancolombia |