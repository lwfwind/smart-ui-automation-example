package test.testnglistener;

import com.qa.framework.testnglistener.ICustomTestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

import java.util.logging.Logger;


public class TestListener implements ICustomTestListener {
    private static Logger logger = Logger.getLogger(TestListener.class.getSimpleName());
    public void onTestFailure(ITestResult tr) {
        logger.info("onCustomTestFailure");
    }

    public void onTestSkipped(ITestResult tr){
        logger.info("onCustomTestSkipped");
    }

    public void onTestSuccess(ITestResult tr){
        logger.info("onCustomTestSuccess");
    }

    public void onTestStart(ITestResult tr){
        logger.info("onTestStart");
    }

    public void onStart(ITestContext testContext){
        logger.info("onStart");
    };

    public void onFinish(ITestContext testContext){
        logger.info("onFinish");
    };
}
