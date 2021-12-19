package baseEntities;

//import com.sun.xml.internal.ws.server.DraconianValidationErrorHandler;
import core.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        switch (ReadProperties.getBrowserType().toLowerCase()) {
            case "chrome" :
                WebDriverManager.getInstance(DriverManagerType.CHROME).setup();

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-gpu");
                //chromeOptions.addArguments("--silent");
                //chromeOptions.setHeadless(ReadProperties.getHeadless());

                driver = new ChromeDriver(chromeOptions);

                break;
            case "firefox" :
                WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();

                driver = new FirefoxDriver();
                break;
            case "safari" :
                WebDriverManager.getInstance(DriverManagerType.SAFARI).setup();

                driver = new SafariDriver();
                break;
            default:
                System.out.println("This type of browser is not supported.");
                break;
        }

        //driver.manage().window().maximize();
        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {

        //driver.quit();
    }
}
