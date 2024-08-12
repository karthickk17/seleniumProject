package pageObjects;

import testEngine.*;
import static businessComponents.common.*;

import businessComponents.CommonMethods;


public class HomePage extends TestEngineClass{

	public static void addProduct() {
		CommonMethods.click(driver.findElement(addToCart));
	}
	
	
	public static void goToCartPage() {
		CommonMethods.click(driver.findElement(cartPagelink));
	}
}
