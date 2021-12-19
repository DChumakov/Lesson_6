package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class HomeWork_3 {

    @Test
    public void homework_1() throws InterruptedException {

        String URL = " https://calc.by/building-calculators/laminate.html";

        setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        String lengthroomValue = "500";
        String widthroomValue = "400";
        String lengthlaminateValue = "2000";
        String widthlaminateValue = "200";
        String quantitylaminateinpackageValue = "8";
        String mincroppinglengthValue = "250";
        String indentationfromthewallValue = "10";


        String expectedNumberOfPanels = "Требуемое количество досок ламината: 53";
        String expectedNumberOfPackages = "Количество упаковок ламината: 7";


// 1. Открыть браузер и перейти на тестируемую страницу
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        WebElement lengthroom = driver.findElement(By.id("ln_room_id"));
        lengthroom.sendKeys(Keys.CONTROL + "a");
        lengthroom.sendKeys(Keys.DELETE);
        lengthroom.sendKeys(lengthroomValue);

        WebElement widthroom = driver.findElement(By.id("wd_room_id"));
        widthroom.sendKeys(Keys.CONTROL + "a");
        widthroom.sendKeys(Keys.DELETE);
        widthroom.sendKeys(widthroomValue);

        WebElement lengthlaminate = driver.findElement(By.id("ln_lam_id"));
        lengthlaminate.sendKeys(Keys.CONTROL + "a");
        lengthlaminate.sendKeys(Keys.DELETE);
        lengthlaminate.sendKeys(lengthlaminateValue);


        WebElement widthlaminate = driver.findElement(By.id("wd_lam_id"));
        widthlaminate.sendKeys(Keys.CONTROL + "a");
        widthlaminate.sendKeys(Keys.DELETE);
        widthlaminate.sendKeys(widthlaminateValue);


        WebElement quantitylaminateinpackage = driver.findElement(By.id("n_packing"));
        quantitylaminateinpackage.sendKeys(Keys.CONTROL + "a");
        quantitylaminateinpackage.sendKeys(Keys.DELETE);
        quantitylaminateinpackage.sendKeys(quantitylaminateinpackageValue);

        WebElement methodoflayinglaminateElement = driver.findElement(By.id("laying_method_laminate"));
        methodoflayinglaminateElement.sendKeys(Keys.CONTROL + "a");
        methodoflayinglaminateElement.sendKeys(Keys.DELETE);
        Select methodoflayinglaminateDropDown = new Select(methodoflayinglaminateElement);

        //sexDropDown.selectByIndex(1);
        methodoflayinglaminateDropDown.selectByValue("2");
        //sexDropDown.selectByVisibleText("женский");

        WebElement mincroppinglength = driver.findElement(By.id("min_length_segment_id"));
        mincroppinglength.sendKeys(Keys.CONTROL + "a");
        mincroppinglength.sendKeys(Keys.DELETE);
        mincroppinglength.sendKeys(mincroppinglengthValue);


        WebElement indentationfromthewalls = driver.findElement(By.id("indent_walls_id"));
        indentationfromthewalls.sendKeys(Keys.CONTROL + "a");
        indentationfromthewalls.sendKeys(Keys.DELETE);
        indentationfromthewalls.sendKeys(indentationfromthewallValue);


        // Направление укладки ламината.


        WebElement radioButton = driver.findElement(By.cssSelector("label[for = 'direction-laminate-id1']"));

        radioButton.click();


        // 7.Нажать на кнопку "Рассчитать"
        WebElement calculate = driver.findElement(By.xpath("//a[@href='javascript:void(0);']"));


        calculate.click();


        // 8.Проверить результаты

        String actualNumberOfPanels = driver.findElement(By.xpath("//*[@id='t3-content']/div[3]/article/section/div[2]/div[3]/div[2]/div[1]")).getText();
        String actualNumberOfPackages = driver.findElement(By.xpath("//*[@id='t3-content']/div[3]/article/section/div[2]/div[3]/div[2]/div[2]")).getText();


        Assert.assertEquals(actualNumberOfPanels, expectedNumberOfPanels, "количество панелей разное");
        Assert.assertEquals(actualNumberOfPackages, expectedNumberOfPackages, "количество упаковок разное");

        Thread.sleep(15000);

        driver.quit();
    }
}


