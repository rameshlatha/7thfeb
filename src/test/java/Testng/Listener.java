package Testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
 public void onTestStart(ITestResult result) {
	 System.out.println("on test start");
 }
 public void onTestSuccess(ITestResult result) {
	System.out.println("on test success"); 
 }
 public void onTestFailure(ITestResult result) {
	 System.out.println("on test failure");

 }
 public void onTestSkipped(ITestResult result) {
	 System.out.println("on test skipped");

 }
 public void onTestFinise(ITestResult result) {
	 System.out.println("on test finise");

 }
}
