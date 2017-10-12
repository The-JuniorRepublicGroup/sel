package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethod {

    public WebDriver driver;

    public WaitMethod(WebDriver driver){

        this.driver = driver;

    }

    /***
     * This Next batch of code and classes creates a method for  waiting for certain elements
     * */


    public void waitUntilElementLoaded(By element) {
        System.out.print(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void visibilityOfElement(By element){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void elementClickable(By element){
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
