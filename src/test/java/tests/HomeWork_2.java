package tests;

import org.testng.annotations.Test;

import static java.lang.System.setProperty;

public class HomeWork_2 {


    @Test
    public void homework_1() throws InterruptedException {

        static String URL = " https://masterskayapola.ru/kalkulyator/laminata.html";

        setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        String lengthroomValue = "3";
        String widthroomValue = "4";
        String lengthlaminateValue = "3";
        String widthlaminateValue = "4";
        String quantitylaminateinpackageValue = "12";
        String pricelaminateValue = "4";
    }
}
