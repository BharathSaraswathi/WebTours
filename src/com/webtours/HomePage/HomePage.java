package com.webtours.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.webtours.base.BrowserInvoke;

public class HomePage extends BrowserInvoke {

	// SignOn link
	public void SignOn() {

		WebElement signOnLink = driver.findElement(By.xpath(".//a[contains(text(),'SIGN-ON')]"));
		signOnLink.click();

		WebElement userName = driver.findElement(By.xpath(".//input[@name='userName']"));
		userName.sendKeys("SELENIUM");

		WebElement password = driver.findElement(By.xpath(".//input[@name='password']"));
		password.sendKeys("JAVA");

		WebElement signIn = driver.findElement(By.xpath(".//input[@name='login']"));
		signIn.click();

	}

	public void Register() {
		// Identify Register link
		WebElement registerLink = driver.findElement(By.xpath(".//a[contains(text(),'REGISTER')]"));
		// Click on Register link
		registerLink.click();
		// Enter Firstnames
		WebElement firstName = driver.findElement(By.xpath(".//input[@name='firstName']"));
		firstName.sendKeys("SELENIUM");
		// Enter SecondName
		WebElement secondName = driver.findElement(By.xpath(".//input[@name='lastName']"));
		secondName.sendKeys("JAVA");
		//Country Selection
		Select countryName = new Select(driver.findElement(By.xpath(".//select[@name='country']")));
		countryName.selectByValue("92");
		// UserName
		WebElement userName = driver.findElement(By.xpath(".//input[@name='email']"));
		userName.sendKeys("Java");
		// Password
		WebElement password = driver.findElement(By.xpath(".//input[@name='password']"));
		password.sendKeys("Selenium");
		// Confirm Password
		WebElement confirmPassword = driver.findElement(By.xpath(".//input[@name='confirmPassword']"));
		confirmPassword.sendKeys("Selenium");
		// Submit
		WebElement submit = driver.findElement(By.xpath(".//input[@name='register']"));
		submit.click();

	}

	public void Support() {
		WebElement supportLink = driver.findElement(By.xpath(".//a[contains(text(),'SUPPORT')]"));
		supportLink.click();

		WebElement backtoHomeButton = driver.findElement(By.xpath(".//img[@src='/images/forms/home.gif']"));
		backtoHomeButton.click();
	}

	public static void main(String[] args) {
		HomePage homePage = new HomePage();
		homePage.Invoke();
		homePage.Register();
		driver.close();

	}

}
