package tests;

import baseEntity.BaseTest;
import core.ReadProperties;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.LoginPage;

public class SmokeTest extends BaseTest {

    @Test (retryAnalyzer = utils.Retry.class)
    public void flakyloginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.getEmailField().sendKeys(ReadProperties.getUsername());
        loginPage.getPasswordField().sendKeys(ReadProperties.getPassword());
        loginPage.getLoginButton().click();

        DashBoardPage dashboardPage = new DashBoardPage(driver);
    }
}

