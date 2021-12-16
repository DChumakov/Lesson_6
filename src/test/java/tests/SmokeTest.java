package tests;

import Core.ReadProperties;
import baseEntities.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class SmokeTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getEmailField().sendKeys(ReadProperties.getUsername());
        loginpage.getPasswordField().sendKeys(ReadProperties.getPassword());
        loginpage.getLoginButton().click();
    }


    @Test
    public void loginTest1() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(ReadProperties.getUsername(), ReadProperties.getPassword());
    }

}
