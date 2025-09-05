package ui;

import org.testng.annotations.*;

public class LoginTest extends CommonDataSetup {

    @BeforeTest
    public void loginToApp() {
        System.out.println("login to app");
    }

    @AfterTest(groups = "regression")
    public void logoutToApp() {
        System.out.println("logout to app");
    }

    @Test(priority = 1)
    public void aTest1() {
        System.out.println("login is successful");
    }

    @BeforeMethod
    public void connectDB() {
        System.out.println("DB connected");
    }

    @AfterMethod
    public void DisconnectDB() {
        System.out.println("DB disconnected");
    }

    @Test(priority = 2, description = "This is test`")
    public void bTest2() {
        System.out.println("logout is successful");

    }
}
