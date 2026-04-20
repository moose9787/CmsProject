 package com.crm.ClientManagementSystem.GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListenerImplementation extends Baseclass implements ITestListener {
	ExtentReports report;
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	String name = result.getName();
	report.createTest(name);
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		Javautility j=new Javautility();
		String dateandTime = j.getDateAndTime("dd-MM-yyyy hh-mm-ss");
		TakesScreenshot	 t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+name+dateandTime+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./ExtentReports/report.html");
		
		reporter.config().setDocumentTitle("CMS EXECUTION rEPORT");
		reporter.config().setReportName("Execution Details");
		reporter.config().setTheme(Theme.DARK);
		
		 report=new ExtentReports();
		 report.attachReporter(reporter);
		report.setSystemInfo("url", "http://localhost:8888");
		report.setSystemInfo("os", "Windows");
		report.setSystemInfo("browser", "chrome");
		report.setSystemInfo("test enginner", "Ali");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
	report.flush();
	}
     
}
