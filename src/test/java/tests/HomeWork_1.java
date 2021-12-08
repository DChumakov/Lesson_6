package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.System.setProperty;

import java.util.concurrent.TimeUnit;

public class HomeWork_1 {
    static String URL = "http://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx";

    @Test
    public void homework_1() throws InterruptedException {

        String widthValue = "3";
        String lengthValue = "4";




        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement width = driver.findElement(By.id("el_f_width"));
        width.sendKeys(widthValue);


        WebElement length = driver.findElement(By.id("el_f_lenght"));
        length.sendKeys(lengthValue);

        WebElement roomElement = driver.findElement(By.id("room_type"));
        Select roomDropDown = new Select(roomElement);

        roomDropDown.selectByValue("4");
       // roomDropDown.selectByVisibleText("Остекленная лоджия или теплый балкон");


        WebElement heattypeElement = driver.findElement(By.id("heating_type"));
        Select heattypeDropDown = new Select(heattypeElement);

        heattypeDropDown.selectByValue("3");
       // heattypeDropDown.selectByVisibleText("Подогрев для комфорта");



        WebElement calculate = driver.findElement(By.name("button"));
        calculate.click();

        Thread.sleep(5000);

        WebElement resultValue = driver.findElement(By.id("floor_cable_power"));

        String resultStr = resultValue.getAttribute("value");
        if (!resultStr.equals("1145")) {
            System.out.println("Некорректное значение");
        }
        WebElement resultValue1 = driver.findElement(By.id("floor_cable_power"));


        String resultStr1 = resultValue.getAttribute("spec_floor_cable_power");
        if (!resultStr.equals("95")) {
            System.out.println("Некорректное значение");
        }


        driver.quit();

    }

}
