package com.orangehrmlive.opensource.demo.testbase;




import com.orangehrmlive.opensource.demo.propertyreader.PropertyReader;
import com.orangehrmlive.opensource.demo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);

    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();

    }

}
