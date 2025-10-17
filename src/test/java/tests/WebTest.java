package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.RetryAnalyzer;
import pages.HomePage;

public class WebTest extends BaseTest {

	 private LoginPage loginPage;
	    private HomePage homePage;

	    @Test(retryAnalyzer = RetryAnalyzer.class)
	    public void testLoginFlow() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("testaccount@mail.com", "Password123");
	        // Validate OTP or next expected screen manually/mocked
	    }
}
