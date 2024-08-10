package testEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static businessComponents.common.*;

public class TestEngineClass {

	public static WebDriver driver;
	
	@BeforeClass
	public static void openBroswer() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
	}
	
	@AfterClass
	public static void closeBrowser() {
        driver.quit();
	}
}
