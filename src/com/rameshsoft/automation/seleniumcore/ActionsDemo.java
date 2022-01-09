package com.rameshsoft.automation.seleniumcore;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Duration;

public class ActionsDemo {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91917\\Desktop\\new8ambatch\\firstapp\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.jqueryui.com");
		
		driver.findElement(By.linkText("Autocomplete")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("tags")).sendKeys("RAMESHSOFT");
		
		Thread.sleep(9000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		/*
		 * 
		 * //driver.navigate().to("https://www.google.com"); //URL url = new
		 * URL("https://www.google.com"); //driver.navigate().to(url); //Using
		 * JavascriptExecutor
		 * 
		 * WebElement userName = driver.findElement(By.id("identifierId"));
		 * //userName.clear(); //userName.sendKeys("rameshsoft.9177791456@gmail.com");
		 * Actions actions = new Actions(driver); //actions.sendKeys(userName,
		 * "rameshsoft.9177791456@gmail.com").build().perform();
		 * 
		 * actions.click(userName).sendKeys("rameshsoft.9177791456@gmail.com").build().
		 * perform();
		 * 
		 * Actions actions2 = actions.click(userName); Actions actions3 =
		 * actions2.sendKeys("rameshsoft.9177791456@gmail.com"); Action action =
		 * actions3.build(); action.perform();
		 * 
		 * 
		 * //Uisng JavascriptExecutor
		 * 
		 * WebElement nxt = driver.findElement(By.id("identifierNext")); //nxt.click();
		 * actions.click(nxt).perform();
		 * 
		 * actions.doubleClick(userName).build().perform();
		 * 
		 * actions.sendKeys(nxt, Keys.ENTER).build().perform();
		 * 
		 * 
		 * actions.sendKeys(Keys.chord(Keys.CONTROL),"t").perform();
		 * actions.sendKeys(Keys.chord(Keys.CONTROL),"j").perform();
		 * 
		 * actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT),"t").build().perform();
		 * 
		 * actions.sendKeys(Keys.END).build().perform();
		 * actions.sendKeys(Keys.HOME).build().perform();
		 * actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		 * actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).perform();
		 * 
		 * actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.
		 * PAGE_UP).perform();
		 * actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_UP).perform();
		 * 
		 * driver.get("https://www.amazon.com/");
		 * 
		 * WebElement element =
		 * driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
		 * actions.moveToElement(element).build().perform();
		 * 
		 * //Using JavascriptExecutor
		 * 
		 * driver.get("https://www.google.com");
		 * driver.findElement(By.name("q")).sendKeys("rameshsoft");
		 * actions.sendKeys(Keys.ENTER).build().perform();
		 * 
		 * WebElement rameshsoft =
		 * driver.findElement(By.xpath("//h3[contains(text(),'RAMESHSOFT – India')]"));
		 * actions.contextClick(rameshsoft).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.
		 * ARROW_DOWN).build().perform();;
		 * 
		 * 
		 * 
		 * //rameshsoft.click(); //actions.clickAndHold(rameshsoft).pause(25).release();
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}
}
