package com.hopestar.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class IListenImpClass implements ITestListener {
 ExtentReports report;
 ExtentTest test;
 
	@Override
	public void onTestStart(ITestResult rsult) {
		String methodname=rsult.getMethod().getMethodName();
		test=report.createTest(methodname);
		Reporter.log(methodname+"--> Test Script Execution Started ");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		test.log(Status.PASS, methodname+"---> passed");
	
		Reporter.log(methodname+"--> Test Script Passed  ");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		//EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator<>(BaseClass.sdriver);
		EventFiringWebDriver driver = new EventFiringWebDriver(BaseClass.sdriver);
		File src = driver.getScreenshotAs(OutputType.FILE);
		String path=".\\src\\screenshot\\fail.png";
		File dst = new File(path);
	try {
		Files.copy(src, dst);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	 try {
	        test.addScreenCaptureFromPath(dst.getAbsolutePath() );
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	test.log(Status.FAIL, methodname+"---> Failed");
	test.log(Status.FAIL, result.getThrowable());
	Reporter.log(methodname+"--> Test Script Failed  ");
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		test.log(Status.SKIP, methodname+"---> Skipped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log(methodname+"--> Test Script Skipped  ");
		
	}

	@Override
	public void onStart(ITestContext context) {
	 	report= new ExtentReports();
		ExtentSparkReporter htmlreport =new ExtentSparkReporter("./Extentreport/report.html");
		htmlreport.config().setDocumentTitle("Doc");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("Hopestar");
		 report.attachReporter(htmlreport);
		 report.setSystemInfo("OS", "windows");
		 report.setSystemInfo("Base-browser", "Chrome");
		 report.setSystemInfo("Base-url", "http://rmgtestingserver/domain/Life_Insurance_Management_System/");
		 report.setSystemInfo("reporter-name", "Ayyappa_naga");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		
	}
	
	
	

}
