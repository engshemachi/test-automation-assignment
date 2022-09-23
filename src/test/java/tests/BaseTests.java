package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import static fileReaderManager.ReadFromFiles.getPropertyByKey;

public class BaseTests {

    public static String configPropertyFileName = "configData.properties";
    WebDriver driver;

    @BeforeMethod
    public void setupWebpage() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get(getPropertyByKey("configurationData.properties", "APP_URL"));
    }

    @AfterClass
    public void closeBrowserAfterTesting() {
        driver.quit();
    }

}
