Feature: Flights Scenarios 
@Valeriia_Beheida
Scenario: Flights one way Scenario
Given a user is on the Expedia home page "https://www.expedia.com/"
When user navigates to Flights and clicks on "One way" box
When user enters airport name "Washington Dulles" in the “Leaving from” box
And user enters "San Francisco" in "Going to" box
And clicks on the date "Nov 28, 2022" in the "Departing" box
And user selects "1 adult" in the "Travelers" box
And clicks on "Search" button
Then user is navigated to the dashboard page 

@Valeriia_Beheida
Scenario: Flights round trip Scenario
Given a user is on the Expedia home page "https://www.expedia.com/"
When user navigates to the Flights Page and clicks on "Round Trip"
When user enters airport name "Washington (IAD - Washington Dulles Intl.)" in the “Leaving from” box
And user enters "San Francisco" in "Going to" box
And clicks on the departing date "Nov 28, 2022" in the "Departing" box
And clicks on the returning date "Nov 29, 2022" in the "Returning" box
And user selects "1 adult" in the "Travelers" box
And clicks on "Search" button
Then user is navigated to the dashboard page 
@Valeriia_Beheida
Scenario: Flights negative Scenario
Given a user is on the Expedia home page "https://www.expedia.com/"
When user navigates to Flights and clicks on "One way" box
Then user enters airport name "Washington Dulles" in the “Leaving from” box
And user enters "Kyiv" in "Going to" box
And clicks on the date "Nov 28, 2022" in the "Departing" box
And user selects "1 adult" in the "Travelers" box
And clicks on "Search" button
Then user is unable to book flights 






