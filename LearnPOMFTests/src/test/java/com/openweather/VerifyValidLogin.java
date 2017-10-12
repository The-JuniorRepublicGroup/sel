package com.openweather;

import com.openweather.pages.LoginPage;
import common.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static common.dataStrings.*;

public class VerifyValidLogin {

    WebDriver driver;

    @Test
    public void checkValidUser()
    {


        // This will launch browser and specified URL
        driver = BrowserFactory.startBrowser("chrome",baseURL);

        // Create Login Page Object
        LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);

        // Call method
        login_page.loginToWeatherSite("rokafor89@gmail.com", "chair1989");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @AfterTest
    public void tearDown(){

        driver.quit();

    }



}
