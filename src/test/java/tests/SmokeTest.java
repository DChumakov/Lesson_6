package tests;

import baseEntity.BaseTest;
import core.ReadProperties;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.LoginPage;

public class SmokeTest extends BaseTest {

    @Test
    public void flakyloginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.emailField.sendKeys(ReadProperties.getUsername());
        loginPage.passwordField.sendKeys(ReadProperties.getPassword());
        loginPage.loginButton.click();

        DashBoardPage dashboardPage = new DashBoardPage(driver);
    }
}

