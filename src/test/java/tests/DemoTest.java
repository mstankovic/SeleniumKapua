package tests;

import commons.utils.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.WelcomePage;

public class DemoTest extends DriverManager {

    @Test
    public void loginWithCorrectCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("kapua-sys");
        loginPage.setPassword("kapua-password");
        loginPage.clickOnLoginButton();

        WelcomePage welcomePage = loginPage.clickOnLoginButton();
        Assert.assertTrue(welcomePage.isPageOpened());
    }
}
