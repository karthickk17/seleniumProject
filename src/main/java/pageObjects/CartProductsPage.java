package pageObjects;

import testEngine.*;
import static businessComponents.common.*;

import businessComponents.CommonMethods;


public class CartProductsPage extends TestEngineClass{

	public static void clickButton() {
		CommonMethods.click(driver.findElement(cashOnDeliveryButton));
	}
	
}
