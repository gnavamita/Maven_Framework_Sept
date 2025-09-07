package ui;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestUtils extends BaseTest{

    public static void main(String[] args) throws IOException {
        Date currentdate = new Date();
        System.out.println(currentdate);
        String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
        System.out.println(screenshotfilename);
        File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotfile, new File(".//screenshot//" + screenshotfilename + ".png"));



    }
}
