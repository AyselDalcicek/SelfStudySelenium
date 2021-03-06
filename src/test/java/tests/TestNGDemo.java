package tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNGDemo {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Before suit");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("Before method");
    }
    @Test (priority = 3)  // Change sequence of test execution
    public void test1(){
        String word1 = "java";
        String word2 = "java";
        System.out.println("Test1");
        Assert.assertEquals(word1, word2);
        }
    //@Ignore
    @Test (priority = 2)
    public void test2(){
        //String word1 = "java";
        String word1 = "javascript";
        String word2 = "javascript";
        System.out.println("Test2");
        Assert.assertEquals(word1, word2);
    }
    @Test (priority = 1)
    public void test3(){
        System.out.println("test3");
      Assert.assertTrue(15>10);
      //Assert.assertTrue(5>10);
        throw new SkipException("Just skipped");  // it suppose to skip this test
    }
    @AfterMethod
    public void teardown(){
        System.out.println("After method");
        }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("After suit");
    }
}
