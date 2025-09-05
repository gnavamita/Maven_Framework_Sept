package ui;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {

    @BeforeSuite
    public void datasetup(){
        System.out.println("common data setup");
    }

    @AfterSuite
    public void datatesrdown(){
        System.out.println("common data cleanup");
    }

}
