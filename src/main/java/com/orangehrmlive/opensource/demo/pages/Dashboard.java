package com.orangehrmlive.opensource.demo.pages;


import com.orangehrmlive.opensource.demo.utility.Utility;
import org.openqa.selenium.By;

public class Dashboard extends Utility {
    By welcomeText = By.xpath("//a[@id='welcome']");





    public String getWelcomeText() {

        return getTextFromElement(welcomeText);
    }

    }



