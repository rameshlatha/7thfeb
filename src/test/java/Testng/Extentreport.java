package Testng;

import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreport implements ITestListener {

	public ExtentSparkReporter sparkreporter;  //UI of the report
	public ExtentReports extent;  //common info to the report
	public ExtentTest test; //entry the data into the report
	
	
	public void onStart(ITestContext context) {
	//specify the location of folder
		sparkreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/Testreport1.html");
		sparkreporter.config().setDocumentTitle("Automation testing");
		sparkreporter.config().setReportName("Smoke Test");
		sparkreporter.config().setTheme(Theme.DARK);
		
		//common info
		extent =new ExtentReports();
		extent.attachReporter(sparkreporter);
		extent.setSystemInfo("computer name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Testername", "latha");
		extent.setSystemInfo("OS", "windows 11");
		extent.setSystemInfo("Browser", "chrome");
			
	}
	public void onTestSuccess(ITestResult result) {
		
		test=extent.createTest(result.getName()); //create a entry in report
		test.log(Status.PASS,"Test is passed:"+result.getName());//update the info in the report
		System.out.println("test is passed");
	}
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,"Test is Failed:"+result.getName());
		test.log(Status.FAIL,"Test is Failed:"+result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP,"Test is Skipped:"+result.getName());
		test.log(Status.SKIP,"Test is skipped:"+result.getThrowable());
	}
	
	public  void onFinish(ITestContext context) {
		extent.flush();
	}
	
	
}
