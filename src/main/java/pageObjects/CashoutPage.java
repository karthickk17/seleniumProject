package pageObjects;

import testEngine.*;
import static businessComponents.common.*;

import businessComponents.CommonMethods;


public class CashoutPage extends TestEngineClass{	
	
	public static void enterCellNumber() {
		CommonMethods.type(driver.findElement(cellNumber), "123");
	}
	
	public static void enterAddress() {
		CommonMethods.type(driver.findElement(deliveryAddr), "abc");
	}
	
	public static void clickButton() {
		CommonMethods.click(driver.findElement(cashoutSubmitButton));
	}
}
