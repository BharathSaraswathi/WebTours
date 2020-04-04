package com.webtours.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserInvoke {

	public static WebDriver driver = null;

	public static void main(String[] args) {
		// Creating Driver Object for Chrome
		driver = new ChromeDriver();
		// Invoking the site on Chrome Browser
		driver.get("http://newtours.demoaut.com/");
		// Identify Register link
		WebElement registerLink = driver.findElement(By.xpath(".//a[contains(text(),'REGISTER')]"));
		// Click on Register link
		registerLink.click();
		// Enter Firstnames
		WebElement firstName = driver.findElement(By.xpath(".//input[@name='firstName']"));
		firstName.sendKeys("SELENIUM");
		// Enter SecondName
		WebElement secondName = driver.findElement(By.xpath(".//input[@name='secondName']"));
		secondName.sendKeys("JAVA");
		Select countryName = new Select(driver.findElement(By.xpath(".//select[@name='country']")));
		countryName.selectByValue("92");
		driver.close();

	}

}
