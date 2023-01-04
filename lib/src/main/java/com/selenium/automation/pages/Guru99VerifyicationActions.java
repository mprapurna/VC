package com.selenium.automation.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.selenium.automation.pages.domids.GooglePageDomIds;
import com.selenium.automation.pages.domids.Guru99PageDomIds;
import com.selenium.framework.utilities.PerformanceTimer;

public class Guru99VerifyicationActions extends BaseActions implements Guru99PageDomIds{
	
	
	public void verifyHomePage() {
		String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
	}
	public void verifyRegisterPage() {
		waitUntilElementLocated(Registerlink).click();
		String expected = "Register: Mercury Tours";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
		
	}
	
	public void verifysupportPage() {
		waitUntilElementLocated(support).click();
		String expected = "Under Construction: Mercury Tours";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
        if(checkIsAlertExist()) {
		Alert alert = driver.switchTo().alert(); // switch to alert
		String alertMessage= driver.switchTo().alert().getText(); // capture alert message
		System.out.println(alertMessage);
		driver.switchTo().alert().dismiss();}
		//waitUntilElementLocated(support).click();
	}
	
	public void clickHomePage() {
		waitUntilElementLocated(homeLink).click();
	}
}
