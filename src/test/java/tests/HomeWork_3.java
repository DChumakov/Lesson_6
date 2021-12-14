package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.System.setProperty;

public class HomeWork_3 {

    @Test
    public void homework_1() {

        String URL = " https://calc.by/building-calculators/laminate.html";

        setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        String lengthroomValue = "500";
        String widthroomValue = "400";
        String lengthlaminateValue = "2000";
        String widthlaminateValue = "200";
        String quantitylaminateinpackageValue = "8";
        String mincroppinglengthValue = "250";
        String indentationfromthewallValue = "10";




        String expectedNumberOfPanels = "53";
        String expectedNumberOfPackages = "7";


// 1. Открыть браузер и перейти на тестируемую страницу
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

        driver.manage().window().maximize();


        WebElement lengthroom = driver.findElement(By.id("ln_room_id"));
        lengthroom.sendKeys(lengthroomValue);

        WebElement widthroom = driver.findElement(By.id("wd_room_id"));
        widthroom.sendKeys(widthroomValue);

        WebElement lengthlaminate = driver.findElement(By.id("ln_lam_id"));
        lengthlaminate.sendKeys(lengthlaminateValue);


        WebElement widthlaminate = driver.findElement(By.id("wd_lam_id"));
        widthlaminate.sendKeys(widthlaminateValue);


        WebElement quantitylaminateinpackage = driver.findElement(By.id("n_packing"));
        quantitylaminateinpackage.sendKeys(quantitylaminateinpackageValue);

        WebElement methodoflayinglaminateElement = driver.findElement(By.id("laying_method_laminate"));
        Select methodoflayinglaminateDropDown = new Select(methodoflayinglaminateElement);

        //sexDropDown.selectByIndex(1);
        methodoflayinglaminateDropDown.selectByValue("2");
        //sexDropDown.selectByVisibleText("женский");

        WebElement mincroppinglength = driver.findElement(By.id("min_length_segment_id"));
        mincroppinglength.sendKeys(mincroppinglengthValue);


        WebElement indentationfromthewalls = driver.findElement(By.id("indent_walls_id"));
        indentationfromthewalls.sendKeys(indentationfromthewallValue);




        // 7.Нажать на кнопку "Рассчитать"
        WebElement calculate = driver.findElement(By.cssSelector("calc-btn"));
        calculate.click();

        //8.Проверить результаты

        String actualLayingArea = driver.findElement(By.id("s_lam")).getText();
        String actualNumberOfPanels = driver.findElement(By.id("l_count")).getText();
        String actualNumberOfPackages = driver.findElement(By.id("l_packs")).getText();
        String actualCost = driver.findElement(By.id("l_price")).getText();
        String actualLeftovers = driver.findElement(By.id("l_over")).getText();
        String actualSegments = driver.findElement(By.id("l_trash")).getText();




        /*
        Assert.assertEquals(actualLayingArea,expectedLayingArea, "МДРД различные");
        Assert.assertEquals(actualNumberOfPanels,expectedNumberOfPanels, "МДРД1 различные");
        Assert.assertEquals(actualNumberOfPackages,expectedNumberOfPackages, "CG различные");
        Assert.assertEquals(actualCost,expectedCost, "BSA различные");
        Assert.assertEquals(actualLeftovers,expectedLeftovers, "BSA различные");
        Assert.assertEquals(actualSegments,expectedSegments, "BSA различные");
       */

        driver.quit();
    }
}


