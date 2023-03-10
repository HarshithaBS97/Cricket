import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.Assertion;
import testExecution.RerunFailedTests;

public class TestBase {

    Assertion assertion = new Assertion();

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(ITestContext context) {
        for (ITestNGMethod method : context.getAllTestMethods()) {
            method.setRetryAnalyzerClass(RerunFailedTests.class);
        }
    }
}
