package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.PageWebPay;

import java.net.MalformedURLException;

public class Applicationlauncher {
    public static WebDriver driver;
    public static PageWebPay pageWebPay;

    public static void setUp() {

        //String Path = "src/test/resources/drivers/mac/chromedriver";
        String Path = "src/test/resources/driver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", Path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        pageWebPay = PageFactory.initElements(driver, PageWebPay.class);
    }
}
