package com.crm.ClientManagementSystem.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {

	public void launchBrowser(WebDriver driver) {
		driver=new ChromeDriver();
		
	}
	
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	public void navtoApplication(WebDriver driver,String url) {
		driver.get(url);
		
	}
	
	public void mousehover(WebDriver driver,WebElement adrress) {
		Actions a=new Actions(driver);
		a.moveToElement(adrress).perform();
	}
	
	public void closeBrowser(WebDriver driver) {
	driver.quit();
	
	}
	
	public void handledropdownByVisibleText(WebElement address,String text) {
		Select s=new Select(address);
		s.selectByVisibleText(text);
		
	}
}
