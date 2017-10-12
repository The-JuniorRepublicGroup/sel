import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

// Import testNg imports
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Import pages from common
import Pages.HomePage;
import Pages.LoginPage;

// Import data objects from common
import static common.dataClass.*;


public class LoginTest {

    WebDriver driver;

    // Make page objects a variable
    LoginPage objLogin;
    HomePage objHomePage;




    @BeforeTest
    public void setUp() {

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    /**
     * This Test case will login to baseURL
     * go to sign in page
     * Verify login page title as "Sign In To Your Account"
     * Login to application
     * Verify the home page using dashboard message
     */

    @Test
    public void testHomePageAppearCorrect() throws InterruptedException {

        // Create Login Page Object
        objLogin = new LoginPage(driver);

        // Go to sign in page
        objLogin.goToSignInPage();



        // Verify login page title
        String loginPageTitle = objLogin.getLoginTitle();



        System.out.println(loginPageTitle.toLowerCase());
        Assert.assertTrue(loginPageTitle.contains("Sign In To Your Account"));
        System.out.println("Log in Account Message Exists Home Page Test passed.");




        // Login to application
        objLogin.loginToPage(email_Id,passWrd);



        // go to next page
        objHomePage = new HomePage(driver);

        // Verify home page
        String dashboardUsername = objHomePage.getHomePageDashboardUsername();

        System.out.println(dashboardUsername);
        Assert.assertTrue(dashboardUsername.contains(userName));
        System.out.println("Sign In Successful, username("+userName+") matches");


        objHomePage.logoutOf();
        Assert.assertTrue(loginPageTitle.contains("Sign In To Your Account"));
        System.out.println("Sign In To Your Account Message Exists Home Page Test passed.");
        System.out.println("Successfully logged out");






    }

    @AfterTest
    public void tearDown() {

        driver.quit();

    }

}
