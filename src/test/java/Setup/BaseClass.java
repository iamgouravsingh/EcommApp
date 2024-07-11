package Setup;

import org.ecom.Modules.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {

    public WebDriver driver;
    public HomePage homePage;
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    private WebDriver initializeDriver(String browser) {

        System.out.println("Browser value is: " + browser);

        if (browser.equals("chrome")) {
            tlDriver.set(new ChromeDriver());
        } else if (browser.equals("firefox")) {
            tlDriver.set(new FirefoxDriver());
        } else if (browser.equals("edge")) {
            tlDriver.set(new EdgeDriver());
        } else if (browser.equals("safari")) {
            tlDriver.set(new SafariDriver());
        } else {
            System.out.println("Please pass the correct browser value: " + browser);
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return getDriver();

    }

    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }

    @BeforeMethod
    public HomePage launchApplication() {
        String browser = "chrome";
        driver = initializeDriver(browser);
        homePage = new HomePage(driver);
        homePage.goTo();
        return homePage;

    }

    @AfterMethod
    public void tearDown() {
        if (tlDriver.get() != null) {
            tlDriver.get().quit();
            tlDriver.remove();
        }


    }
}

