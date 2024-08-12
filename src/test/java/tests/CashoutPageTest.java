//import testEngine.TestEngineClass;
package tests;

import org.testng.annotations.Test;

import pageObjects.*;

public class CashoutPageTest extends CashoutPage{
	
	@Test()
	public static void cashOnDeliveryTest() throws InterruptedException {
		enterCellNumber();
		Thread.sleep(2000);
		enterAddress();
		Thread.sleep(2000);
		clickButton();
		Thread.sleep(2000);
	}
	
	
}
