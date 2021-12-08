package tests;

import org.openqa.selenium.By;

public class CssSelectors {

    private void cssSelectors() {

        By classSelector = By.cssSelector(".radio");  // поиск по классу radio
        By classSelector1 = By.className("radio");  // поиск по классу radio

        By idSelector = By.cssSelector("#suite_mode_single");  // поиск по классу id
        By idSelector1 = By.className("#suite_mode_single");  // поиск по классу id

        By tagSelector = By.cssSelector("label");  // поиск по классу tag
        By tagSelector1 = By.className("label");  // поиск по классу tag

        By tagAttributeSelector = By.cssSelector("label[for='name']");  // поиск по  tag и атрибуту со значением
        By tagAttributeSelector1 = By.className("label[for]");  // поиск по tag и присутствием атрибута

        By multipleClassesSelector = By.cssSelector(".column.overflow-content");  // поиск по 2 классам  в элементе

        By simpleHierarchicalsSelector = By.cssSelector(".table .content-inner");  // поиск простого дочернего элемента

        By fullHierarchicalsSelector = By.cssSelector("div[class~='column']");  // использование трёуровневой иерархии для поиска дочернего элемента

        By searchLikeContainesSelector = By.cssSelector("form[action*='admin']");  // поиск с вхождением подстроки в значение атрибута

        By searchByWordSelector = By.cssSelector("form[action*='admin']");  // поиск с вхождением слова в значении атрибу

        By valueStartsFromSelector = By.cssSelector("a[href^='https://']");  // поиск элемента с атрибутом значение которого начинается с чего-то

        By valueEndsWithSelector = By.cssSelector("ul[href$='@gmail.com']");  // поиск элемента с атрибутом значение которого заканчивается на что-то

        By childRightAfterParentSelector = By.cssSelector("ul>li");  // поиск дочернего li у которого родитель ul

        By elementRightAfterElementSelector = By.cssSelector("#form+script");  // поиск поиск элемента script который идёт сразу после элемента #form

        By elementOnTheSameLevelSelector = By.cssSelector("li:first-child");  // поиск элементов script которым предшевствует элемент #form

        By firstChildSelector = By.cssSelector("li:last-child");  // поиск 1 дочернего элемента

        By lastChildSelector = By.cssSelector("li:nth-child(5)");  // поиск последнего дочернего элемента

        By nthChildFromBeginSelector = By.cssSelector("li:nth-last-child(3)");  // поиск н-ного дочернего элемента с начала

        By nthChildFromEndSelector = By.cssSelector("#form~script");  // поиск н-ного дочернего элемента с конца










    }
}
