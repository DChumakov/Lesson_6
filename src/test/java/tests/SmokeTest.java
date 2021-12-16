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
        loginpage.getEmailField().sendKeys(ReadProperties.getusername());
        loginpage.getpasswordField().sendKeys(ReadProperties.getpassword());
        loginpage.getloginButton().click();
    }



}
