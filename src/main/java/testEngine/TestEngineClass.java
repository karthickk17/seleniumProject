package testEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import static businessComponents.common.*;

public class TestEngineClass {

	public static WebDriver driver;
	
	//Listener Variables
	public static ExtentReports report;
	public static ExtentTest logger;
	
	@BeforeTest
	public static void openBroswer() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
	}
	
	
	@AfterTest
	public static void closeBrowser() {
        //driver.close();
	}
}
