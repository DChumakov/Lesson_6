package tests;

import baseEntities.BaseTest;
import core.ReadProperties;
import org.testng.annotations.Test;
import pages.AddProjectPage;
import pages.DashboardPage;
import pages.LoginPage;

public class SmokeTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.getEmailField().sendKeys(ReadProperties.getUsername());
        loginPage.getPasswordField().sendKeys(ReadProperties.getPassword());
        loginPage.getLoginButton().click();
    }

    @Test
    public void loginTest1() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(ReadProperties.getUsername(), ReadProperties.getPassword());
    }



    @Test
    public void addProjectTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(ReadProperties.getUsername(), ReadProperties.getPassword());

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.goToProject();

        AddProjectPage addProjectPage = new AddProjectPage(driver);
        //driver.get("https://qa1502.testrail.io/index.php?/admin/projects/add/1");
        addProjectPage.addProject("chumakovd","тестирование проекта",true,1);
    }
}
