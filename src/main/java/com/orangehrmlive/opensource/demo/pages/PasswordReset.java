package com.orangehrmlive.opensource.demo.pages;

import com.orangehrmlive.opensource.demo.utility.Utility;
import org.openqa.selenium.By;

public class PasswordReset extends Utility {


    By forgotPasswordField = By.tagName("h1");


    public String forgotPassword() {
        return getTextFromElement(forgotPasswordField);

    }
}