package tests;

public class xPathSelectors {
    private static String absolutePath = "/html/body/div";


    private static String allElementsInHTMLPath = "//*"; //все элементы на странице начиная с html - тега


    private static String bodyPath = "//body"; //элемент по тэгу


    private static String childPath = "//form/input"; // дочерний элемент относительно родителя


    private static String tagWithAttrPath = "//span[@id='access--1']"; // поиск элемента с атрибутом и его значением

    private static String parentPath1 = "//span[@id='access--1']/.."; // поиск родителя у элемента с атрибутом и его значением
    private static String parentPath2 = "//*[@id='suite_mode_single']/parent::label"; // поиск родителя у элемента с атрибутом и его значением

    private static String elementByIndexPath = "(//form)[4]"; // поиск элемента по индексу


    private static String searchByTextPath = "(//*[text() = 'New Widget']"; // поиск лемента по полному соответствию по тексту
    private static String searchByTextPath1 = "//*[. = 'New Widget']"; // поиск лемента по полному соответствию по тексту

    private static String searchBySubstringPath = "//*[contains(text(),'Widget']"; // поиск элемента по подстроке в тексте
    private static String searchByStartsWithPath = "//input[starts-with(@type, 'hi')]"; // поиск элемента по атрибуту , значение которого начинается с


    private static String searchByTwoAttrPath = "//*[@class='form-control ' and @type='text']"; // поиск логического оператора


    private static String searchBySpecificAttrPath = "//input[@type != 'hidden']"; // поиск элемента по атрибуту

    private static String Path2 = "//input[@type != 'hidden']"; // axes - оси , использование ancestor - все предки текущего узла

    private static String Path3 = "//ul//child::li"; // использование child - все предки текущего узла зависят от уровня
    private static String Path4 = "//ul//span"; // аналог только проще


    private static String Path3 = "//ul/child::li"; //
    private static String Path4 = "//ul/li"; // аналог только проще

    private static String Path5 = "//ul/descendant::span"; // использование -
    private static String Path6 = "//ul/descendant::span"; // аналог только проще

    private static String Path6 = "//ul/descendant::span"; // использование following - все предки текущего узла независимо от уровня
    private static String Path6 = "//ul/descendant::span"; // аналог только проще
}
