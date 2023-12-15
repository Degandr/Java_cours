package Home_work_20.Tests;

import Home_work_20.Tests.Utils.TestListener;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.*;

@Log4j2
@Listeners(TestListener.class)
public class BaseTest {

    @BeforeSuite
    public void setUp() {
        Configuration.timeout = 10000;
        Configuration.pollingInterval = 1000;
        Configuration.browser = "edge";
        Configuration.headless = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        log.info("Finished set up of allure");
    }

    @AfterMethod(alwaysRun = true)
    public void clearCookies() {
        Selenide.clearBrowserCookies();
        Selenide.closeWebDriver();
    }
}
