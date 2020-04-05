package com.webtours.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserInvoke {

	public static WebDriver driver = null;

	public void Invoke() {
		// Creating Driver Object for Chrome
		driver = new ChromeDriver();
		// Invoking the site on Chrome Browser
		driver.get("http://newtours.demoaut.com/");

	}

}
