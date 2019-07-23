package framework_weight_watchers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import stepdefinition_weight_watchers.SharedSD;

public class BasePage {
	public void clickOn(By locator) {
		try {
			SharedSD.getDriver().findElement(locator).click();
		}catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator :" +locator.toString() );
			e.printStackTrace();
		}
	}
	public void enterNumber(By locator ,int number) {
		try {
		SharedSD.getDriver().findElement(locator).sendKeys(String.valueOf(number));
		}catch(NoSuchElementException e) {
		Assert.fail("Element is not found with this locator :" +locator.toString());	
		e.printStackTrace();
		}
	}
	public String getTextFromElement(By locator) {
		  String text=null;
		  try {
			  text=SharedSD.getDriver().findElement(locator).getText();
		  }catch(NoSuchElementException e){
			  Assert.fail("Element is not found with this locator :" +locator.toString());
			  e.printStackTrace();
		  }
		  return text;
	}
	public String verifyNewsPage(By locator) {
		String text = null;
		try {
			text = SharedSD.getDriver().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}

		return text;
	}
}
