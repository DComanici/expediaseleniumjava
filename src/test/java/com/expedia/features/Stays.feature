Feature: Stays Expedia Scenarios

  @Daniela_Comanici
  Scenario: Search Hotels using Stays Option
    Given user is on the Expedia home page "https://www.expedia.com"
    When user navigates to Stays and types "Kyiv Ukraine"
    And user selects "Dec 18, 2022" in check-in and "Dec 26, 2022" in check-out
    And user clicks Search
    Then the Hotel Search page is displayed

  @Daniela_Comanici
  Scenario: Not being able to Search Hotels to stay longer than 28 days
    Given user is on the Expedia home page "https://www.expedia.com"
    When user navigates to Stays and types "Kyiv Ukraine"
    And user selects "Nov 21, 2022" in check-in and "Dec 24, 2022" in check-out
    And user clicks Search
    Then user is shown an error

  @Daniela_Comanici
  Scenario: View a hotel's amenities and return to hotels page
    Given user is on the Expedia home page "https://www.expedia.com"
    When user navigates to Stays and types "Kyiv Ukraine"
    And user selects "Dec 18, 2022" in check-in and "Dec 26, 2022" in check-out
    And user clicks Search
    Then the Hotel Search page is displayed
    And user clicks on "Hotel Ukraine" hotel
    And hotel page "Hotel Ukraine" is displayed and user clicks on amenities
    And user switches back to Hotels Search tab
    Then the Hotel Search page is displayed
