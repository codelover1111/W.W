package stepdefinition_weight_watchers;

import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework_weight_watchers.WeightWatchersPage;

public class WeightWatchersSD {
	
	WeightWatchersPage weightWatchersPage=new WeightWatchersPage();
	
	@Given("^user open the default browser$")
	public void userOpenTheDefaultBrowser() throws Throwable {
	    SharedSD.getDriver().get("https://www.weightwatchers.com/us/");
	}
    
	@Given("^user is on home page$")
	public void userNavigateToWeightWatchers() throws Throwable {
		Assert.assertEquals(SharedSD.getDriver().getTitle(), "WW (Weight Watchers): Weight Loss & Wellness Help","Element is not found");
	}
     
    @When("^user click on Find a Studio right corner of the page,$")
	public void userClickOnFindAStudio() throws Throwable {
		weightWatchersPage.clickOnFindStudio();
	}

	@When("^user verify loaded page title contains “Find WW Studios & Meetings Near You  WW USA”$")
	public void userVerifyLoadedPageTitleContainsFindWWStudiosMeetingsNearYouWWUSA() throws Throwable {
		Assert.assertEquals(SharedSD.getDriver().getTitle(), "Find WW Studios & Meetings Near You | WW USA","Element is not found");
	} 
	

	@When("^user in the search field, search for meetings for zip code: \"([^\"]*)\"$")
	public void userInTheSearchFieldSearchForMeetingsForZipCode(int number) throws Throwable {
		weightWatchersPage.enterSearch(number);
	}
	@When("^user click on arrow sign$")
	public void userClickOnArrowSign() throws Throwable {
		weightWatchersPage.clickOnArrow();
	}
	@When("^user print the title of the first result and the distance \\(located on the right of location title/name\\)$")
	public void userPrintTheTitleOfTheFirstResult() throws Throwable {
		System.out.println(weightWatchersPage.getLocation());
		System.out.println(weightWatchersPage.getDistance());
		
		
	}

	@When("^user click on the first search result and then, verify displayed location name/title matches with the name of the first searched result that was clicked\\.$")
	public void userVerifyTitle() throws Throwable {
		weightWatchersPage.clickOnFirstResult();
		weightWatchersPage.verifyTheLocation();
		weightWatchersPage.scrollDown();
				
	}

	@When("^user from this location page, print TODAY’s hours of operation \\(located towards the bottom of the page\\)$")
	public void printTodaysHoursOfOperation() throws Throwable {
		weightWatchersPage.systemDay();
		System.out.println(weightWatchersPage.getHoursOfOperations());
		
	}

	@When("^user create a method to print the number of meeting the each person\\(under the scheduled time\\) has a particular day of the week$")
	public void printTheNumberOfMeetingDetails() throws Throwable {
	   weightWatchersPage.persons();
	}

	@Then("^user log out from the page$")
	public void userLogOutFromThePage() throws Throwable {
	   // SharedSD.getDriver().quit();
	}


}
