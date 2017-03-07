@Search @TaggedAgain
Feature: Search feature
  As a user
  I want to be able to search for given search term
  So that i can perform and navigate to link based on search term

  Background:
    Given the user is on home page
    When user clicks the rent tab
    And user provides the details as follows:
      | searchTerm | minPrice | maxPrice | propertyType | minBed |
      | Portsmouth | 500      | 4000     | flats        |    1   |
    And user clicks the search button

  @Search
  Scenario: Search for given search term
    Then user navigates to searchPageWith Portsmouth List

  @Search
  Scenario: Search for given search term and navigate to Grid View
    When user click on view as Grid View
    Then view enabled is Grid View

  @Search
  Scenario: Search for given search term and navigate to Map View
    When user click on view as Map View
    Then view enabled is Map View




