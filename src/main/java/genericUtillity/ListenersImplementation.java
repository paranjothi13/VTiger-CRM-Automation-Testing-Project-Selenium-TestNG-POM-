package genericUtillity;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ListenersImplementation implements ITestListener {
	ExtentReports reports;
	ExtentTest test;
	ExtentSparkReporter reporter;
	@Override
	public void onStart(ITestContext context) {
		reporter = new ExtentSparkReporter("./ExtentReports/Report.html");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("VTiger Execution");
		reporter.config().setTheme(Theme.STANDARD);
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("OS", "Windows");
		reports.setSystemInfo("Browser", "Edge");
		reports.setSystemInfo("Tester", "Paranjothi");
	}
	@Override
	public void onTestStart(ITestResult result) {
		test = reports.createTest(result.getMethod().getMethodName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass("Test Passed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		SelenniumUtility sUtil = new SelenniumUtility();
		try {
			String path = sUtil.takeWebpageScreenshot(BaseClass.sDriver, result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		test.skip("Test Skipped");
	}
	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}
}
