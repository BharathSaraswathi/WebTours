package com.webtours.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInvoke {

	public static WebDriver driver = null;

	public static void main(String[] args) {
		//Creating Driver Object for Chrome
		driver = new ChromeDriver();
		//Invoking the site on Chrome Browser
		driver.get("http://newtours.demoaut.com/");
		driver.close();

	}

}
