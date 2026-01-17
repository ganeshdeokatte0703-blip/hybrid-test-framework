Feature: Google search
  Scenario: Search for cucumber
    Given I open the homepage
    When I search for cucumber
    Then the results page should show results
