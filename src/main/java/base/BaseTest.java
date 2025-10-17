package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import utils.PropertiesReader;

public class BaseTest {

    protected WebDriver driver;
    protected String url;
    protected String browser;
    @BeforeTest
    public void setUpReports() {
        // Initialize Extent Reports once per test (or suite)
    //    extent = ReportManager.initReports();
    }
    @BeforeMethod
    public void setup() {
      
        PropertiesReader config = new PropertiesReader("configuration.properties");
        url = config.get("url");
        browser = config.get("browser");
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Default Browser");
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);
    }

 //   @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}