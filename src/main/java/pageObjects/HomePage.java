package pageObjects;

import testEngine.*;
import static businessComponents.common.*;

import org.openqa.selenium.WebDriver;

import businessComponents.CommonMethods;


public class HomePage extends TestEngineClass{

	public static void addProduct() {
		WebDriver driver = driverLocal.get();
		CommonMethods.click(driver.findElement(addToCart));
	}
	
	
	public static void goToCartPage() {
		WebDriver driver = driverLocal.get();
		CommonMethods.click(driver.findElement(cartPagelink));
	}
}
