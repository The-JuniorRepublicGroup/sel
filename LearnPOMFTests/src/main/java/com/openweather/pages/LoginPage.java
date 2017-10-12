package com.openweather.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver ldriver){


        this.driver = ldriver;

    }

    @FindBy(id="user_email")
    WebElement userEmail;

    @FindBy(how = How.ID, using = "user_password")
    WebElement pass;

    @FindBy(xpath = "//*[@id=\"new_user\"]/input[3]")
    WebElement loginBtn;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[5]/div/div/div/h3")
    WebElement loginBoxTitle;

    public void loginToWeatherSite(String email, String passwd)
    {
        userEmail.sendKeys(email);
        pass.sendKeys(passwd);
        loginBtn.click();
    }

    public boolean seeLoginBoxTitle()
    {
        Boolean isLoginBoxTitleShowing = loginBoxTitle.isDisplayed();

        return isLoginBoxTitleShowing;
    }

}
