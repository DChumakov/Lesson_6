package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.System.setProperty;

public class HomeWork_4_selectori {

    @Test
    public void CSSselectors(){
        String URL = "http://chumakov-shop.com";

        setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

// 1. Открыть браузер и перейти на тестируемую страницу
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);


        List<WebElement> elements = (List<WebElement>) driver.findElements(By.cssSelector("a[href^=http]"));

        for (WebElement e : elements) {
            System.out.println(e.getAttribute("href"));
        }

        

        driver.quit();


    }
}
