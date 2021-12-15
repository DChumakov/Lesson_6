package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.System.setProperty;


public class HomeWork_2 {


    @Test
    public void homework_1() throws InterruptedException {

      String URL = " https://masterskayapola.ru/kalkulyator/laminata.html";

        setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        String lengthroomValue = "5,0";
        String widthroomValue = "2,0";
        String lengthlaminateValue = "1300,0";
        String widthlaminateValue = "192,0";
        String quantitylaminateinpackageValue = "12,0";
        String pricelaminatepackageValue = "500,0";
        String seriesoffsetValue = "300,0";
        String indentationfromthewallValue = "10,0";



        String expectedLayingArea = "9.86 м2";
        String expectedNumberOfPanels = "45";
        String expectedNumberOfPackages = "4";
        String expectedCost = "5990";
        String expectedLeftovers = "3";
        String expectedSegments = "5";


// 1. Открыть браузер и перейти на тестируемую страницу
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

        driver.manage().window().maximize();


        WebElement lengthroom = driver.findElement(By.name("calc_roomwidth"));
      //  lengthroom.clear();
      lengthroom.sendKeys(Keys.CONTROL + "a");
      lengthroom.sendKeys(Keys.DELETE);
        lengthroom.sendKeys(lengthroomValue);

        WebElement widthroom = driver.findElement(By.name("calc_roomheight"));
      //widthroom.clear();
      widthroom.sendKeys(Keys.CONTROL + "a");
      widthroom.sendKeys(Keys.DELETE);
        widthroom.sendKeys(widthroomValue);

        WebElement lengthlaminate = driver.findElement(By.name("calc_lamwidth"));
      //lengthlaminate.clear();
        lengthlaminate.sendKeys(Keys.CONTROL + "a");
        lengthlaminate.sendKeys(Keys.DELETE);
        lengthlaminate.sendKeys(lengthlaminateValue);


        WebElement widthlaminate = driver.findElement(By.name("calc_lamheight"));
     // widthlaminate.clear();
      widthlaminate.sendKeys(Keys.CONTROL + "a");
      widthlaminate.sendKeys(Keys.DELETE);
        widthlaminate.sendKeys(widthlaminateValue);

        WebElement quantitylaminateinpackage = driver.findElement(By.name("calc_inpack"));
      //quantitylaminateinpackage.clear();
      quantitylaminateinpackage.sendKeys(Keys.CONTROL + "a");
      quantitylaminateinpackage.sendKeys(Keys.DELETE);
        quantitylaminateinpackage.sendKeys(quantitylaminateinpackageValue);

        WebElement pricelaminatepackage = driver.findElement(By.name("calc_price"));
     // pricelaminatepackage.clear();
      pricelaminatepackage.sendKeys(Keys.CONTROL + "a");
      pricelaminatepackage.sendKeys(Keys.DELETE);
        pricelaminatepackage.sendKeys(pricelaminatepackageValue);

        WebElement layingdirectionElement = driver.findElement(By.name("calc_direct"));
        Select layingdirectionDropDown = new Select(layingdirectionElement);

        //sexDropDown.selectByIndex(1);
        layingdirectionDropDown.selectByValue("toh");
     // layingdirectionDropDown.selectByVisibleText("По ширине комнаты");

        WebElement seriesoffset = driver.findElement(By.name("calc_bias"));
     // seriesoffset.clear();
      seriesoffset.sendKeys(Keys.CONTROL + "a");
      seriesoffset.sendKeys(Keys.DELETE);
        seriesoffset.sendKeys(seriesoffsetValue);

        WebElement indentationfromthewall = driver.findElement(By.name("calc_walldist"));
     // indentationfromthewall.clear();
      indentationfromthewall.sendKeys(Keys.CONTROL + "a");
      indentationfromthewall.sendKeys(Keys.DELETE);
        indentationfromthewall.sendKeys(indentationfromthewallValue);



        // 7.Нажать на кнопку "Рассчитать"
      WebElement calculate = driver.findElement(By.xpath("//input[@value='Рассчитать']"));
      calculate.click();

      Thread.sleep(5000);

        //8.Проверить результаты

        String actualLayingArea = driver.findElement(By.id("s_lam")).getText();
        String actualNumberOfPanels = driver.findElement(By.id("l_count")).getText();
        String actualNumberOfPackages = driver.findElement(By.id("l_packs")).getText();
        String actualCost = driver.findElement(By.id("l_price")).getText();
        String actualLeftovers = driver.findElement(By.id("l_over")).getText();
        String actualSegments = driver.findElement(By.id("l_trash")).getText();





        Assert.assertEquals(actualLayingArea,expectedLayingArea, "различные");
        Assert.assertEquals(actualNumberOfPanels,expectedNumberOfPanels, "различные");
        Assert.assertEquals(actualNumberOfPackages,expectedNumberOfPackages, "различные");
        Assert.assertEquals(actualCost,expectedCost, "различные");
        Assert.assertEquals(actualLeftovers,expectedLeftovers, "различные");
        Assert.assertEquals(actualSegments,expectedSegments, "различные");


        driver.quit();
    }


  }

