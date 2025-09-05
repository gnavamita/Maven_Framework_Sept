package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest extends CommonDataSetup{
Boolean datasetup = false;

    @Test(enabled = false)
    public void skiptest1(){
        System.out.println("skipping this test");
    }

    @Test
    public void skiptest2(){
        System.out.println("skipping this test forcefully");
        throw new SkipException("skippng this test");
    }

    @Test
    public void skiptest3(){

        System.out.println("skipping this test based on condition");
    if (datasetup==true){
        System.out.println("execute the test");
    }
    else {
        System.out.println("do not execute further steps");
        throw new SkipException("Do not exceute further steps");
    }

    }
}
