package com.orangehrmlive.opensource.demo.testsuite;


import com.orangehrmlive.opensource.demo.pages.HomePage;
import com.orangehrmlive.opensource.demo.pages.Dashboard;
import com.orangehrmlive.opensource.demo.pages.PasswordReset;
import com.orangehrmlive.opensource.demo.testbase.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dashboardTest extends TestBase {
    HomePage homepage = new HomePage();
    Dashboard dashboard = new Dashboard();
    PasswordReset passwordReset = new PasswordReset();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        homepage.enterUserName("Admin");
        homepage.enterPasswordField("admin123");
        homepage.clickOnLoginButton();
       String expectedMessage = "Welcome";
        String fullActualMessage = dashboard.getWelcomeText();
        String actualMessage =fullActualMessage.substring(0,7);
        Assert.assertEquals(expectedMessage, actualMessage, "Welcome not displayed");

    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        homepage.clickOnForgotPassword();

        String expectedErrorMessage = "Forgot Your Password?";
        String actualErrorMessage = passwordReset.forgotPassword();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Forgot password not displayed");



    }

    }



