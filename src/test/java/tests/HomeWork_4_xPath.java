package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.System.setProperty;

public class HomeWork_4_xPath {
    @Test
    public void HomeWork_4_xPath() {
        String URL = "http://chumakov-shop.com";

        setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

        private static String absolutePath = "/html/body/div[2]/div[2]/div/section/div[1]/div/div[2]/aside/div[1]/div[1]";

        private static String allElementsInHTMLPath = "//*"; //все элементы на странице начиная с html - тега

        private static String bodyPath = "<body class=\"common-home\" style>"; //элемент по тэгу

        private static String childPath = "<input placeholder=\"Ваше имя\" data-cme=\"Имя \" =\"\" class=\"cme-txt\" type=\"text\" maxlength=\"150\""; // дочерний элемент относительно родителя

        private static String tagWithAttrPath = "//span[@id=\"cart-total2\"]"; // поиск элемента с атрибутом и его значением

        private static String parentPath1 = "//span[@id=\"cart-total2\"]/.."; // поиск родителя у элемента с атрибутом и его значением

        private static String parentPath2 = "//*[@id=\"hidden\"]/parent::body";

        private static String elementByIndex = "id=\"body\""; // поиск родителя у элемента с атрибутом и его значением

        private static String searchByTextPath1 = "//*[. = 'Каталог товаров']"; // поиск лемента по полному соответствию по тексту

        private static String searchBySubstringPath = "//*[contains(text(), 'Бренды')]"; // поиск элемента по подстроке в тексте

        private static String searchByStartsWithPath = "//input[starts-with(@type, 'se')]";

        private  static String searchByTwoAttrPath = "//*[@class='swipe' and @style='height: 228px;']";

        private static String searchBySpecificAttrPath = "//input[@type != 'text']";


        // axes - оси

        private static String Path1 = "//*[@id=\"back-top\"]/ancestor::div";

        private static String Path2_1 = "//ul//child::script";
        private static String Path2_2 = "//ul//script";


        private static String Path2_3 = "//ul/child::div";
        private static String Path2_4 = "//ul/div";

        private static String Path3_1 = "//ul/descendant::script";
        private static String Path3_2 = "//ul//script";

        private static String Path4_1 = "//aside[@class='col-sm-3']/following::script";
        private static String Path4_2 = "//aside[@class='col-sm-3']/following::div/*[@class='container']";


        private static String Path5_1 = "//aside[@class='col-sm-3']/following-sibling::div";


        private static String Path6_1 = "//aside[@class='col-sm-3']/preceding::div";

        private static String Path7_1 = "//aside[@class='col-sm-3']/preceding-sibling::div";



    }
}

