package com.selenium.automation.pages;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.automation.pages.domids.GooglePageDomIds;
import com.selenium.framework.utilities.PerformanceTimer;
import com.selenium.framework.driver.Drivers;

public class BaseActions{
	WebDriver driver;
	WebDriverWait wait;
	//String url="https://www.google.com/";
	
public void browserSetup(String url) {
	//driver=new ChromeDriver();
	Drivers d= new Drivers(driver);
	driver=d.setDriverOptions(url);
	//return (ChromeDriver) driver;
}
public WebElement waitUntilElementLocated(By Byelement) {
	wait =new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(Byelement));
	return element;
}
public boolean checkIsAlertExist() {
	  wait =new WebDriverWait(driver,Duration.ofSeconds(30));
     //alertIsPresent() condition applied
     if(wait.until(ExpectedConditions.alertIsPresent())==null)
      return false;
     else
	  return true;
}



public void teardown() {
	driver.close();
	driver.quit();
}
}

