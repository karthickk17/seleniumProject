package pageObjects;

import testEngine.*;
import static businessComponents.common.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import businessComponents.CommonMethods;


public class CartProductsPage extends TestEngineClass{

	public static void clickButton() {
		WebDriver driver = driverLocal.get();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(cashOnDeliveryButton));
		CommonMethods.click(driver.findElement(cashOnDeliveryButton));
	}
	
}
