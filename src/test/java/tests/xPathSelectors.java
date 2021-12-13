package tests;

public class xPathSelectors {
    private static String absolutePath = "/html/body/div";


    private static String allElementsInHTMLPath = "//*"; //все элементы на странице начиная с html - тега


    private static String bodyPath = "//body"; //элемент по тэгу


    private static String childPath = "//form/input"; // дочерний элемент относительно родителя


    private static String tagWithAttrPath = "//span[@id='access--1']"; // поиск элемента с атрибутом и его значением

    private static String parentPath = "//span[@id='access--1']/.."; // поиск родителя у элемента с атрибутом и его значением

    private static String elementByIndexPath = "(//form)[4]"; // поиск элемента по индексу


    private static String searchByTextPath = "(//*[text() = 'New Widget']"; // поиск лемента по полному соответствию по тексту
    private static String searchByTextPath1 = "//*[. = 'New Widget']"; // поиск лемента по полному соответствию по тексту

    private static String searchBySubstringPath = "//*[contains(text(),'Widget']"; // поиск элемента по подстроке в тексте


    private static String searchByTwoAttrPath = "//*[@class='form-control ' and @type='text']"; // поиск логического оператора


    private static String searchBySpecificAttrPath = "//input[@type != 'hidden']"; // поиск




//*[contains(text(),'Ne') and contains(text(), 'et')]

}
