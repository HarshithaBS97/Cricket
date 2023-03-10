package testExecution;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunFailedTests implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
