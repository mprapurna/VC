package com.selenium.framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drivers {
	WebDriver driver;
	WebDriverWait wait;
    
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Drivers(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver setDriverOptions(String url) {
		//if(driver.equals(new ChromeDriver())){
			String ProjectPath=System.getProperty("user.dir").replace("\\","/");
			ProjectPath+="/Drivers/Chrome/chromedriver.exe";
			System.out.println("porjectpath ="+ProjectPath);
			System.setProperty("webdriver.chrome.driver",ProjectPath);
			//System.setProperty("webdriver.chrome.driver","X://chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
					//options.addArguments("start-maximized");
					
					ChromeDriver driver = new ChromeDriver(options);
					driver.get(url);
					return driver;
		//}
	}
}
