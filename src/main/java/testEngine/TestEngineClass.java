package testEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import businessComponents.CommonMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

import static businessComponents.common.*;

public class TestEngineClass {

    // ThreadLocal WebDriver for parallel execution
    public static ThreadLocal<WebDriver> driverLocal = new ThreadLocal<>();
    
    // Listener Variables for ExtentReports
    public static ExtentReports report;
    public static ExtentTest logger;
    
    @BeforeClass
    public static void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driverLocal.set(new ChromeDriver());
        
        // Get the driver instance for the current thread and perform actions
        WebDriver driver = driverLocal.get();
        driver.manage().window().maximize();
        driver.get(url);  // 'url' needs to be initialized from 'businessComponents.common'
    }
    
    @AfterClass
    public static void closeBrowser() throws InterruptedException {
        WebDriver driverInstance = driverLocal.get();
        if (driverInstance != null) {
            driverInstance.quit(); // Close the browser for this thread's WebDriver instance
            driverLocal.remove(); // Remove the WebDriver instance from ThreadLocal
        }
    }
}
