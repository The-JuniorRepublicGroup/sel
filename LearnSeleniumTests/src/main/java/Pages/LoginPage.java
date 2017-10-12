package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){

        this.driver = driver;

    }

    private By email_Id = By.id("user_email");
    private By passwd = By.id("user_password");
    private By titleText = By.xpath("/html/body/div[3]/div[4]/div/div/div/h3");
    private By loginLink = By.xpath("/html/body/div[1]/div/div/div[1]/a[3]");
    private By loginBtn = By.xpath("//*[@id=\"new_user\"]/input[3]");

    /***
     * This Next batch of code and classes creates a method for  waiting for certain elements
     * */


    private void waitUntilElementLoaded(By element) {
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

    /***
     * This Next batch of code and classes creates methods for what I can  possibly do on this particular page
     * */


    // go to sign in page
    public void goToSignInPage(){

        waitUntilElementLoaded(loginLink);
        driver.findElement(loginLink).click();

    }


    // Find Email input box and Set email in the textbox
    private void setEmail_Id(String strEmail){

        elementClickable(email_Id);
        driver.findElement(email_Id).clear();
        driver.findElement(email_Id).sendKeys(strEmail);

    }

    // Find password input box and set email in the textbox
    private void setPasswd(String strPasswd){

        elementClickable(passwd);
        driver.findElement(passwd).clear();
        driver.findElement(passwd).sendKeys(strPasswd);

    }

    // Click on login button
    private void clickLoginBtn(){

        elementClickable(loginBtn);
        driver.findElement(loginBtn).click();

    }


    // Get the title of Login Page
    public String getLoginTitle() {

        visibilityOfElement(titleText);
        return driver.findElement(titleText).getText();


    }


    /**
     * This POM Method will be exposed in test case to login in the application *
     * @param strEmail
     * @param strPasswd
     * @return
     */


    public void loginToPage(String strEmail, String strPasswd){

        // Fill email address
        this.setEmail_Id(strEmail);

        // Fill Password
        this.setPasswd(strPasswd);

        // Click login button
        this.clickLoginBtn();

    }

}
