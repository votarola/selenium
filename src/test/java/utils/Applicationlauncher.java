package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pages.PageWebPay;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Applicationlauncher {
    public static WebDriver driver;
    public static PageWebPay pageWebPay;
    public static PageWebPay elementosin;
    public static UtilsDriver utilsDriver;
    public static AppiumDriver driverMobile;

    public static void setUp() throws MalformedURLException {

        driverMobile = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities());
        driverMobile.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //String Path = "src/test/resources/drivers/mac/chromedriver";
        //DRIVER CHROME
        String Path = "src/test/resources/driver/windows/chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", Path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageWebPay = PageFactory.initElements(driver, PageWebPay.class);

    }


    public static DesiredCapabilities capabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("deviceName", "db3cb419");
        capabilities.setCapability("platformName", "Android");

        //capabilities.setCapability("dontStopAppOnReset", true);
        //capabilities.setBrowserName("chrome");

        capabilities.setCapability("appPackage", "cl.transbank.apppyme");
        capabilities.setCapability("appActivity", "cl.transbank.apppyme.MainActivity");
        //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        capabilities.setCapability("noReset", true);

        //capabilities.setCapability("chromedriverExecutable",
        //        "src/test/resources/driver/windows/chromedriver.exe");
        //capabilities.setCapability("newCommandTimeout", 1800); // 30min

        capabilities.setCapability("noReset", true);
        capabilities.setCapability("autoGrantPermissions", true);

        return capabilities;
    }
}

