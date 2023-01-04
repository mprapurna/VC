package com.selenium.automation.pages;

import org.openqa.selenium.Keys;

import com.selenium.automation.pages.domids.GooglePageDomIds;
import com.selenium.framework.utilities.PerformanceTimer;

public class GoogleVerifyicationActions extends BaseActions implements GooglePageDomIds{
	
	
	public void verifyPage() {
		waitUntilElementLocated(searchinputBox).sendKeys("selenium");
		PerformanceTimer.wait(2000);
	    driver.findElement(searchbtn).sendKeys(Keys.RETURN);
	}
}
