package com.rameshsoft.automation.seleniumcore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91917\\Desktop\\new8ambatch\\firstapp\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		
		WebElement dayDD = driver.findElement(By.id("day"));
		
		String tagName = dayDD.getTagName();
		if (tagName.equalsIgnoreCase("select")) {
			Select select = new Select(dayDD);
			select.selectByIndex(5);
			select.selectByValue("12");
			select.selectByVisibleText("25");
			WebElement firstSelectedElement = select.getFirstSelectedOption();
			String txt = firstSelectedElement.getText();
			System.out.println(txt);
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			System.out.println(allSelectedOptions);
			List<WebElement> allElements = select.getOptions();
			System.out.println(allElements);
			boolean status = select.isMultiple();
			if (status) {
				System.out.println("It is a multi select DD");
			}
			else {
				System.out.println("It is NOT a multi select DD");
			}
		}
		else {
			driver.findElement(By.xpath("//*[@id='day']/option[5]")).click();
			List<WebElement> allSelectedOptions = driver.findElements(By.xpath("//*[@id='day']/option"));
			System.out.println(allSelectedOptions);
		}
		
		
		
		
	}

}
