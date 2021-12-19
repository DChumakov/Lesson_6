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

        By classSelector = By.cssSelector(".box-content");  // поиск по классу radio


        By idSelector = By.cssSelector("#column-left");  // поиск по классу id


        By tagSelector = By.cssSelector("label");  // поиск по классу tag


        By tagAttributeSelector = By.cssSelector("span[style='font-size: 17px;'");  // поиск по  tag и атрибуту со значением


        By multipleClassesSelector = By.cssSelector(".js.csstransforms");  // поиск по 2 классам  в элементе

        By simpleHierarchicalsSelector = By.cssSelector(".col-sm-3 .inner");  // поиск простого дочернего элемента

        By fullHierarchicalsSelector = By.cssSelector("body .col-sm-3 .inner");  // использование трёуровневой иерархии для поиска дочернего элемента


        By searchLikeContainesSelector = By.cssSelector("div[class*='special-heading']");  // поиск с вхождением подстроки в значение атрибута

        By searchByWordSelector = By.cssSelector("div[class~='special-heading']");  // поиск с вхождением слова в значении атрибута


        By valueStartsFromSelector = By.cssSelector("a[href^='http://']");  // поиск элемента с атрибутом значение которого начинается с чего-то


        By valueEndsWithSelector = By.cssSelector("a[href$='o-nas']");  // поиск элемента с атрибутом значение которого заканчивается на что-то



        By childRightAfterParentSelector = By.cssSelector("li class='parent'");  // поиск дочернего li у которого родитель ul


        By elementRightAfterElementSelector = By.cssSelector("<!--[if lt IE 9]>\n" +
                "\t\t\t  <script type=\"text/javascript\" src=\"catalog/view/javascript/PIE-1.0.0/PIE.js\"></script>\n" +
                "\t\t\t<![endif]-->");  // поиск элемента script который идёт сразу после элемента div

        By elementOnTheSameLevelSelector = By.cssSelector("<script type=\"text/javascript\">\n" +
                "\t$(function(){\n" +
                "\t\t$('.info-list li').last().addClass('last');\n" +
                "\t});\n" +
                "</script>");  // поиск элементов script которым предшевствует элемент div


        By firstChildSelector = By.cssSelector("li class='first'");  // поиск 1 дочернего элемента

        By lastChildSelector = By.cssSelector("li class='last'");  // поиск последнего дочернего элемента


        By nthChildFromBeginSelector = By.cssSelector("<li class=\"col-sm-4 first-in-line\"><div class=\"padding\"><div class=\"imag\"><div class=\"image\"><a href=\"http://chumakov-shop.com/osnovaniya-raketok/gewo_force_arc_off\"><!-- star ipl --><!-- end ipl --><img id=\"img_203\" src=\"http://chumakov-shop.com/image/cache/data/02-osnovania/Gewo/force arc-192x192.jpg\" title=\"GEWO Force ARC Off\" alt=\"GEWO Force ARC Off\"></a></div><div class=\"cart\"><a onclick=\"addToCart('203');\" class=\"button tooltip-1\" title=\"\" data-original-title=\"Купить\"><i class=\"fa fa-shopping-cart\"></i><span>Купить</span></a></div></div><div class=\"left\"><div class=\"name\"><a href=\"http://chumakov-shop.com/osnovaniya-raketok/gewo_force_arc_off\">GEWO Force ARC Off</a></div><div class=\"description1\">Force ARC сочетает в себе высокотехнологичные материалы из карбона и арамида (ARC) с...</div><div class=\"description\">Force ARC сочетает в себе высокотехнологичные материалы из карбона и арамида (ARC) с высококачественным отделанным шпоном. Карбон обеспечивает высокую скорость и стабильность, а Арамид - хорошее чувство мяча.\n" +
                "\n" +
                "Почувствуйте сбалансированную твердость и оптимальное ощущение. Стабильная игра на всей ..</div><div class=\"price\">\n" +
                "\t\t\t\t\t\t274.95 руб.\t\t\t\t</div><div class=\"cart-button\"><div class=\"wishlist\"><a title=\"В закладки\" onclick=\"addToWishList('203');\"><i class=\"fa fa-star\"></i><span>В закладки</span></a></div><div class=\"compare\"><a title=\"В сравнение\" onclick=\"addToCompare('203');\"><i class=\"fa fa-bar-chart-o\"></i><span>В сравнение</span></a></div><div class=\"clear\"></div></div><div class=\"rating\">\n" +
                "\t\t\t\t\t</div></div></div></li>");  // поиск н-ного дочернего элемента с начала

        By nthChildFromEndSelector = By.cssSelector("<li class=\"cat-height  col-sm-2 last-in-line\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<div class=\"name subcatname\"><a href=\"http://chumakov-shop.com/osnovaniya-raketok/osnovanie-Nittaku\">Nittaku</a></div>\n" +
                "\t\t\t\t</li>");  // поиск н-ного дочернего элемента с конца




        driver.quit();


    }
}
