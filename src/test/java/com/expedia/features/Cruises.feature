
Feature: Cruises
 @Mari_Harsan
  Scenario: User seraches for Mexico cruise
    Given user is on expedia homepage "https://www.expedia.com/"
    And user clicks on "Cruises"
    And user clicks on "Select destination" and selects "Mexico" as destination
    And user selects departure date as early as "November 27"
    And user selects departure date as late as "December 27"
    And user clicks "Search"
    Then cruises display
 @Mari_Harsan
  Scenario: User seraches for Bahamas cruise
    Given user is on expedia homepage "https://www.expedia.com/"
    And user clicks on "Cruises"
    And user selects "Bahamas" as destination
    And user selects departure date as early as "November 27"
    And user selects departure date as late as "December 27"
    And user clicks "Search"
    Then cruises display

  @Mari_Harsan
  Scenario: User seraches for Bahamas cruise negative
    Given user is on expedia homepage "https://www.expedia.com/"
    And user clicks on "Cruises"
    And user selects "Bahamas" as destination
    And user selects departure date as early as "November 14"
    And user selects departure date as late as "November 15"
    And user clicks "Search"
    Then user is shown error