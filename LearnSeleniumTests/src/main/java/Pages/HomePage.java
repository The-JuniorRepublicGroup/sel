package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;

    }


    By homePageUserName = By.xpath("/html/body/div[1]/div/div[1]/a[2]");
    By successNotification = By.xpath("/html/body/div[3]/div[4]/div/div/div/div[2]");
    By notificationCloseBtn = By.xpath("/html/body/div[3]/div[4]/div/div/div/div[1]/button");
    By logoutBtn = By.xpath("/html/body/div[3]/div[5]/div[1]/div/a");

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




    // Get the user name from Home Page
    public String getHomePageDashboardUsername(){

        return driver.findElement(homePageUserName).getText();
    }


    // Log out of home page
    public void logoutOf(){

        // Find Logout Button
        elementClickable(logoutBtn);
        driver.findElement(logoutBtn).click();

    }

    // verify success banner
    public void verifySuccessBanner(){

        // verify success banner
        visibilityOfElement(successNotification);
        driver.findElement(successNotification).getText();

        // Find successful banner pop up and close
        driver.findElement(notificationCloseBtn).click();

    }






}
