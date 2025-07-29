package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {

	public static ExtentHtmlReporter html; // White Paper
	public static ExtentReports extent; // Printer
	public static ExtentTest logger; // ink

	public static void setupReport() {
		html = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\Reports\\AutomationTestReport.html");
		extent = new ExtentReports();
		extent.attachReporter(html);
	}

	public static void startReporting(String testcaseName) {
		logger = extent.createTest(testcaseName);
	}

	public static void stopReporting() {
		extent.flush();
	}

}
