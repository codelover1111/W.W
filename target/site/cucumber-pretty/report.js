$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("weightwatchers.feature");
formatter.feature({
  "line": 2,
  "name": "Weight Watchers functions feature",
  "description": "",
  "id": "weight-watchers-functions-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 7143904778,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user open the default browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "WeightWatchersSD.userOpenTheDefaultBrowser()"
});
formatter.result({
  "duration": 3868826229,
  "status": "passed"
});
formatter.match({
  "location": "WeightWatchersSD.userNavigateToWeightWatchers()"
});
formatter.result({
  "duration": 7699211,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Weight Watchers functions feature",
  "description": "",
  "id": "weight-watchers-functions-feature;weight-watchers-functions-feature",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@regression-weightWatchers"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user click on Find a Studio right corner of the page,",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user verify loaded page title contains “Find WW Studios \u0026 Meetings Near You  WW USA”",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user in the search field, search for meetings for zip code: \"10011\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user click on arrow sign",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user print the title of the first result and the distance (located on the right of location title/name)",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user click on the first search result and then, verify displayed location name/title matches with the name of the first searched result that was clicked.",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user from this location page, print TODAY’s hours of operation (located towards the bottom of the page)",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user create a method to print the number of meeting the each person(under the scheduled time) has a particular day of the week",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user log out from the page",
  "keyword": "Then "
});
formatter.match({
  "location": "WeightWatchersSD.userClickOnFindAStudio()"
});
formatter.result({
  "duration": 3320179082,
  "status": "passed"
});
formatter.match({
  "location": "WeightWatchersSD.userVerifyLoadedPageTitleContainsFindWWStudiosMeetingsNearYouWWUSA()"
});
formatter.result({
  "duration": 5723562,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10011",
      "offset": 61
    }
  ],
  "location": "WeightWatchersSD.userInTheSearchFieldSearchForMeetingsForZipCode(int)"
});
formatter.result({
  "duration": 117774847,
  "status": "passed"
});
formatter.match({
  "location": "WeightWatchersSD.userClickOnArrowSign()"
});
formatter.result({
  "duration": 242648732,
  "status": "passed"
});
formatter.match({
  "location": "WeightWatchersSD.userPrintTheTitleOfTheFirstResult()"
});
formatter.result({
  "duration": 502795609,
  "status": "passed"
});
formatter.match({
  "location": "WeightWatchersSD.userVerifyTitle()"
});
formatter.result({
  "duration": 404829421,
  "status": "passed"
});
formatter.match({
  "location": "WeightWatchersSD.printTodaysHoursOfOperation()"
});
formatter.result({
  "duration": 59297702,
  "status": "passed"
});
formatter.match({
  "location": "WeightWatchersSD.printTheNumberOfMeetingDetails()"
});
formatter.result({
  "duration": 427693376,
  "status": "passed"
});
formatter.match({
  "location": "WeightWatchersSD.userLogOutFromThePage()"
});
formatter.result({
  "duration": 29537,
  "status": "passed"
});
formatter.after({
  "duration": 54995937,
  "status": "passed"
});
});