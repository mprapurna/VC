package com.selenium.framework.utilities;

public class PerformanceTimer {
public static void wait(int waittime) {
	try {
		Thread.sleep(waittime);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
