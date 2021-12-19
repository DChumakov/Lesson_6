package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {

    private By addProjectButton_Selector = By.xpath("//a[@href='index.php?/admin/projects/add/1']");


    public DashboardPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getAddProjectButton() {
        return driver.findElement(addProjectButton_Selector);
    }

    public void goToProject() {
        getAddProjectButton().click();
    }



}
