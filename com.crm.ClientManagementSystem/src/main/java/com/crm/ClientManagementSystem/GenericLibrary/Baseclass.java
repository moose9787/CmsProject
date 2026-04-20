package com.crm.ClientManagementSystem.GenericLibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import objectRepository.Homepage;
import objectRepository.LoginPage;

public class Baseclass {
	 FileUtils f=new FileUtils();
	SeleniumUtility  sutil=new SeleniumUtility();
	public static WebDriver driver;
	@BeforeSuite
	public void connectToDatabase() {
		Reporter.log("database connected",true);
	}
	
	@BeforeTest
	public void navAndLaunchBrowser() throws IOException {

driver=new ChromeDriver();

  sutil.maximizeBrowser(driver);
  sutil.implicitWait(driver);
  
  
 
 String URL = f.readDatFromProperty("url");
   sutil.navtoApplication(driver, URL);
	Reporter.log("browser launched and navigated to cms",true);
	}
	
	
	@BeforeMethod
	public void loginToCms() throws IOException {
		LoginPage l=new LoginPage(driver);
		String username = f.readDatFromProperty("username");
		String pw = f.readDatFromProperty("password");
	 l.logintocms(driver, username, pw);
		
		
		Reporter.log("logged in",true);
	}
	
	@AfterMethod
	public void logoutFromCms() throws InterruptedException {
		Homepage hp=new Homepage(driver);
		WebElement element = hp.getProfile();
		Thread.sleep(5000);
		sutil.mousehover(driver, element);			
		hp.getSignoutlink().click();
	}
	
	@AfterTest
	public void closeBrowser() {
		sutil.closeBrowser(driver);
	}
	
	
}
