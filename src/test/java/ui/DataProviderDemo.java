package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderDemo {
    @DataProvider
    public Object[][] dataSet1(Method m) {

        Object[][] testdata = null;

        if (m.getName().equals("test"))
        testdata = new Object[][]{
                {"username", "password" },
                {"username1", "password1" },
                {"username2", "password2"},
                {"username3", "password3"},
        };

        else if (m.getName().equals("test1")) {
            testdata = new Object[][]{
                    {"username", "password", "test"},
                    {"username1", "password1", "test1"},
                    {"username2", "password2", "test2"},
                    {"username3", "password3", "test3"},
            };

        }

        else if (m.getName().equals("test2")){
            testdata = new Object[][]{
                    {"username", "password", "test","test"},
                    {"username1", "password1", "test1", "test1"},
                    {"username2", "password2", "test2","test2"},
                    {"username3", "password3", "test3","test3"},
            };
            }

        return testdata;

    }


}
