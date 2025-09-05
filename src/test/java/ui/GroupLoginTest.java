package ui;

import org.testng.annotations.*;

@Test(groups = "user-regression")
public class GroupLoginTest extends CommonDataSetup {

    @BeforeClass
    public void beforeclass(){
        System.out.println("before class");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("after class");
    }

    @BeforeGroups(value = "regression")
    public void beforegroup(){
        System.out.println("before group");
    }

    @AfterGroups(value = "bvt")
    public void AFtergroup(){
        System.out.println("after group");
    }

    @Test(priority = 1, groups = "regression")
    public void aTest1() {
        System.out.println("regression");
    }

    @Test(priority = 2, groups = "regression")
    public void bTest2() {
        System.out.println("regression");

    }

    @Test(groups = {"regression", "bvt"})
    public void Test3() {
        System.out.println("regression bvt");
    }

    @Test(groups = "bvt")
    public void Test4() {
        System.out.println("bvt");
    }
}
