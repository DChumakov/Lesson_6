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


    private static String searchByTextPath = "//*[text() = 'New Widget']"; // поиск лемента по полному соответствию по тексту
    private static String searchByTextPath1 = "//*[. = 'New Widget']"; // поиск лемента по полному соответствию по тексту

    private static String searchBySubstringPath = "//*[contains(text(),'Widget']"; // поиск элемента по подстроке в тексте
    private static String searchByStartsWithPath = "//input[starts-with(@type, 'hi')]"; // поиск элемента по атрибуту , значение которого начинается с


    private static String searchByTwoAttrPath = "//*[@class='form-control ' and @type='text']"; // поиск логического оператора


    private static String searchBySpecificAttrPath = "//input[@type != 'hidden']"; // поиск элемента по атрибуту

    //axes - оси

    private static String Path1 = "//*[@id=\"suite_mode_single_baseline\"]/ancestor::div"; // использование ancestor - все предки текущего узла

    // использование child
    private static String Path2_1 = "//ul//child::span"; // использование child - все предки текущего узла зависят от уровня
    private static String Path2_2 = "//ul//span"; // аналог только проще


    private static String Path2_3 = "//ul/child::li";
    private static String Path2_4 = "//ul/li"; // аналог только проще

    // использование descendant
    private static String Path3_1 = "//ul/descendant::span"; // все предки текущего узла независимо от уровня
    private static String Path3_2 = "//ul//span"; // аналог только проще


    // использование following
    private static String Path4_1 = "//label[@for=\"announcement\"]/following::form"; // выбирает всё в документе после закрытия тега текущего узла
    private static String Path4_2 = "//label[@for=\"announcement\"]/following::div/*[@class='checkbox'])[1]";


    // использование following-sibling
    private static String Path5_1 = "//aside[@class='col-sm-3']/following-sibling::div"; // выбирает все узлы одного уровня после текущего узла

    //использование preceding
    private static String Path6_1 = "//aside[@class='col-sm-3']/preceding::div"; // выбирает все узлы , которые появляются перед текущим узлом в документе

    //использование preceding-sibling
    private static String Path7_1 = "//aside[@class='col-sm-3']/preceding-sibling::div"; // выбирает все узлы одного уровня до текущего узла


}
