package framework_weight_watchers;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import gherkin.formatter.Reporter;
import junit.framework.Assert;
import stepdefinition_weight_watchers.SharedSD;

public class WeightWatchersPage extends BasePage{
	

	
	private By findStudio=By.xpath("//span[contains(text(),'Find a Studio')]");
    private By meetingSearch=By.xpath("//input[@id='meetingSearch']");
	private By arrowSign=By.xpath("//button[@class='btn spice-translated']");
	private By locationName=By.xpath("//span[contains(text(),'WW Studio Flatiron')]");
	private By distance=By.xpath("//div[contains(text(),'0.49 mi.')]");
	private By todaysDay=By.xpath("//div[@class='hours-list-item-day']");
	private By operationsHours=By.xpath("//li[@class='hours-list-item'][2]");
	private By  persons=By.xpath("//div[@class='schedule-detailed-day-meetings']");
	
	
	
	
	public void clickOnFindStudio() {
		clickOn(findStudio);
		}
    public void enterSearch(int number) {
		enterNumber(meetingSearch, number);
	}
	public void clickOnArrow() {
		clickOn(arrowSign);
		
	}
	public String getLocation() {
		return    SharedSD.getDriver().findElement(locationName).getText();
		
	}
	public String getDistance() {
		return    SharedSD.getDriver().findElement(distance).getText();
	
	}
	public void clickOnFirstResult() {
		clickOn(locationName);
	}
	public void scrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor)SharedSD.getDriver();
		jse.executeScript("window.scrollBy(0,800)");
	}
	@SuppressWarnings("deprecation")
	public void verifyTheLocation() {
		String actualTitle = SharedSD.getDriver().findElement(By.xpath("//span[contains(text(),'WW Studio Flatiron')]")).getText();
		String expectedTitle = "WW Studio Flatiron";
		Assert.assertEquals(actualTitle, expectedTitle);
		}
	public String systemDay() {
	     Format dateFormat = new SimpleDateFormat("EEE");
	      String result = dateFormat.format(new Date());
	      System.out.println(result);
      return result;
      
      }
	public String getHoursOfOperations() {
		return    SharedSD.getDriver().findElement(operationsHours).getText();
	}
	public void persons() {
       List<WebElement> countrycodes=	SharedSD.getDriver().findElements(By.xpath("//div[@class='schedule-detailed-day-meetings-item-leader']"));
		ArrayList<String> strings = new ArrayList<String>();
		for(WebElement e : countrycodes){
		   strings.add(e.getText());
		}
        countFrequencies(strings);
}
     public static void countFrequencies(ArrayList<String> strings) {
	
		Map<String, Integer> hm = new HashMap<String, Integer>();

		for (String i : strings) {
		Integer j = hm.get(i);
		hm.put(i, (j == null) ? 1 : j + 1);
		}
		for (Map.Entry<String, Integer> val : hm.entrySet()) {
		System.out.println( val.getKey() + " "  + ": " + val.getValue() );
		}
		}



		}


