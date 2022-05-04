package com.orangehrmlive.opensource.demo.pages;



import com.orangehrmlive.opensource.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By userNameField = By.xpath("//input[@id='txtUsername']");
    By passwordField = By.xpath("//input[@id='txtPassword']");
    By loginButton = By.xpath("//input[@id='btnLogin']");
    By forgotPassword = By.linkText("Forgot your password?");



    public void enterUserName(String userName){

        sendTextToElement(userNameField,userName);
    }
    public void enterPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public void clickOnForgotPassword(){
        clickOnElement(forgotPassword);
    }

    }


