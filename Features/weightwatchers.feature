 @regression
 Feature: Weight Watchers functions feature 
 
 Background:
 Given user open the default browser
 And user is on home page
 
 @regression-weightWatchers
 Scenario: Weight Watchers functions feature

 When user click on Find a Studio right corner of the page,
 And user verify loaded page title contains “Find WW Studios & Meetings Near You  WW USA”
 And user in the search field, search for meetings for zip code: "10011"
 And user click on arrow sign
 And user print the title of the first result and the distance (located on the right of location title/name)
 And user click on the first search result and then, verify displayed location name/title matches with the name of the first searched result that was clicked.
 And user from this location page, print TODAY’s hours of operation (located towards the bottom of the page)
 And user create a method to print the number of meeting the each person(under the scheduled time) has a particular day of the week
 Then user log out from the page