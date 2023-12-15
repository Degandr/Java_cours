package Home_work_20.Tests.Utils;

import lombok.extern.log4j.Log4j2;
import org.testng.ITestListener;
import org.testng.ITestResult;
@Log4j2
public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        log.info("Test {} started", result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("Test {} successfully finished", result.getName());
    }
}
