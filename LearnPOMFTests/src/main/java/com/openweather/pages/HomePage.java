package com.openweather.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[5]/div[1]/div/a")
    WebDriver logoutBtn;

    @FindBy(how = How.LINK_TEXT, using = "Signed in successfully.")
    WebElement successMessage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"undefined-sticky-wrapper\"]/div/div/div[2]/ul/li[1]/a")
    WebElement weatherPageLink;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div/div[2]/ol/li/a")
    WebElement homeBtn;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div/div[1]/h3")
    WebElement homeText;


    public String homePageTitle()
    {
        return homeText.getText();
    }


}
