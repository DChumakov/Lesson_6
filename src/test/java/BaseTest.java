import org.testng.annotations.*;

public class BaseTest {
    //Before Annotations
    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("BeforeGroups");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod

    public void beforeMethod() {
        System.out.println("BeforeMethod");
    }

    //After Annotations
    @AfterTest
    public void AfterTest() {
        System.out.println("AfterTest");
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("AfterSuite");
    }

    @AfterGroups
    public void AfterGroups() {
        System.out.println("AfterGroups");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("AfterClass");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("AfterMethod");
    }
}
