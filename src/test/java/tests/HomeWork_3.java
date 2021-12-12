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

        String lengthroomValue = "6m";
        String widthroomValue = "3m";
        String lengthlaminateValue = "1300mm";
        String widthlaminateValue = "192mm";
        String quantitylaminateinpackageValue = "12pcs";
        String pricelaminatepackageValue = "500r/m2";
        String seriesoffsetValue = "300mm";
        String indentationfromthewallValue = "10mm";



        String expectedLayingArea = "17.82m2";
        String expectedNumberOfPanels = "80pc";
        String expectedNumberOfPackages = "7pcs";
        String expectedCost = "10483rub";
        String expectedLeftovers = "4pcs";
        String expectedSegments = "24pcs";


// 1. Открыть браузер и перейти на тестируемую страницу
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

        driver.manage().window().maximize();


        WebElement lengthroom = driver.findElement(By.name("calc_roomwidth"));
        lengthroom.sendKeys(lengthroomValue);

        WebElement widthroom = driver.findElement(By.name("calc_roomheight"));
        widthroom.sendKeys(widthroomValue);

        WebElement lengthlaminate = driver.findElement(By.name("calc_lamwidth"));
        lengthlaminate.sendKeys(lengthlaminateValue);


        WebElement widthlaminate = driver.findElement(By.name("calc_lamheight"));
        widthlaminate.sendKeys(widthlaminateValue);

        WebElement quantitylaminateinpackage = driver.findElement(By.name("calc_inpack"));
        quantitylaminateinpackage.sendKeys(quantitylaminateinpackageValue);

        WebElement pricelaminatepackage = driver.findElement(By.name("calc_price"));
        pricelaminatepackage.sendKeys(pricelaminatepackageValue);

        WebElement layingdirectionElement = driver.findElement(By.name("calc_direct"));
        Select layingdirectionDropDown = new Select(layingdirectionElement);

        //sexDropDown.selectByIndex(1);
        layingdirectionDropDown.selectByValue("toh");
        //sexDropDown.selectByVisibleText("женский");

        WebElement seriesoffset = driver.findElement(By.name("calc_bias"));
        seriesoffset.sendKeys(seriesoffsetValue);

        WebElement indentationfromthewall = driver.findElement(By.name("calc_walldist"));
        indentationfromthewall.sendKeys(indentationfromthewallValue);



        // 7.Нажать на кнопку "Рассчитать"
        WebElement calculate = driver.findElement(By.className("btn btn-secondary btn-lg tocalc"));
        calculate.click();

        //8.Проверить результаты

        String actualLayingArea = driver.findElement(By.id("s_lam")).getText();
        String actualNumberOfPanels = driver.findElement(By.id("l_count")).getText();
        String actualNumberOfPackages = driver.findElement(By.id("l_packs")).getText();
        String actualCost = driver.findElement(By.id("l_price")).getText();
        String actualLeftovers = driver.findElement(By.id("l_over")).getText();
        String actualSegments = driver.findElement(By.id("l_trash")).getText();





        Assert.assertEquals(actualLayingArea,expectedLayingArea, "МДРД различные");
        Assert.assertEquals(actualNumberOfPanels,expectedNumberOfPanels, "МДРД1 различные");
        Assert.assertEquals(actualNumberOfPackages,expectedNumberOfPackages, "CG различные");
        Assert.assertEquals(actualCost,expectedCost, "BSA различные");
        Assert.assertEquals(actualLeftovers,expectedLeftovers, "BSA различные");
        Assert.assertEquals(actualSegments,expectedSegments, "BSA различные");


        driver.quit();
    }
}


