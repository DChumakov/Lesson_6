package pages;

import baseEntities.BasePage;
import core.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddProjectPage extends BasePage {

    private By project_name_Selector= By.id("name");
    private By project_announcement_Selector = By.xpath("//textarea[@id='announcement']");
    private By project_show_announcement_Selector = By.id("show_announcement");
    private By project_suite_mode_Selector = By.name("suite_mode");
    private By project_button_Selector = By.id("accept");
    private By PAGE_OPENED_IDENTIFIER = By.className("content-header-title page_title");

    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return super.isPageOpened(PAGE_OPENED_IDENTIFIER);
    }

    // Реализация гетерров элементов
    public WebElement getNameField() {
        return driver.findElement(project_name_Selector);
    }

    public WebElement getAnnounceField() {
        return driver.findElement(project_announcement_Selector);
    }

    public WebElement getShowAnnounceCheckBox() {
        return driver.findElement(project_show_announcement_Selector);
    }

    public List<WebElement> getSuiteModeRadio() { return driver.findElements(project_suite_mode_Selector); }

    public WebElement getAddProjectButton() { return driver.findElement(project_button_Selector); }

    public void addProject(String name, String announcement,Boolean show_announcement,Integer suite_mode) {
        getNameField().sendKeys(name);
        getAnnounceField().sendKeys(announcement);
        if (show_announcement) {
            getShowAnnounceCheckBox().click();
        }

        getSuiteModeRadio().get(suite_mode).click();
        getAddProjectButton().click();
    }




}
