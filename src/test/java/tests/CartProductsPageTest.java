//import testEngine.TestEngineClass;
package tests;

import org.testng.annotations.Test;

import pageObjects.*;

public class CartProductsPageTest extends CartProductsPage{
	
	@Test()
	public static void cashOnDeliveryTest() throws InterruptedException {
		clickButton();
	}
	
	
}
