package com.rameshsoft.automation.seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91917\\Desktop\\new8ambatch\\firstapp\\Drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.rameshsoft.com");
	
	//driver.findElement(By.linkText("Contact Now")).click();;
	WebElement contactNow = driver.findElement(By.linkText("Contact Now"));
	
	if (contactNow.isDisplayed()&&contactNow.isEnabled()) {
		contactNow.click();
	}
	else {
		System.out.println("ContactNow element is NOT displayed");
	}
	
	
	WebElement urName = driver.findElement(By.name("your-name"));
	
	if (urName.isDisplayed()&&urName.isEnabled()) {
		urName.clear();
		urName.sendKeys("rameshsoft");
	}
	else {
		System.out.println("Your-Name element is NOT displayed");
	}
	
	WebElement radioBtn = driver.findElement(By.xpath("//input[@value='Online']"));
	
	if (radioBtn.isDisplayed()&&radioBtn.isEnabled()) {
		radioBtn.click();
	}
	else {
		System.out.println("RADIO BUTTON element is NOT displayed");
	}
	
	if (radioBtn.isSelected()) {
		System.out.println("RADIO button is selected");
	}
	else {
		//throw exception
		System.out.println("RADIO button is NOT selected");
	}
	
	
	WebElement agreeWithUs = driver.findElement(By.name("AgreeWithUs"));
	if (agreeWithUs.isDisplayed()&&agreeWithUs.isEnabled()) {
		agreeWithUs.click();
	}
	else {
		System.out.println("CHECK-agreeWithUs element is NOT displayed");
	}

	
	
	//WebDriver driver = new Chromedriver();
	
		
}
}
