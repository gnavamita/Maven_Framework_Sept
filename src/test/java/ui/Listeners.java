package ui;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static com.sun.jna.platform.win32.GDI32Util.getScreenshot;

public class Listeners extends TestUtils implements ITestListener {

    public void onTestStart(ITestResult result) {
        // not implemented
    }
    public void onTestSuccess(ITestResult result) {
        System.out.println();
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed - screenshot failed");

//        try{
//         //   getScreenshot();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // not implemented
    }

}
