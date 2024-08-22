package pageObjects;

import testEngine.*;
import static businessComponents.common.*;

import org.openqa.selenium.WebDriver;

import businessComponents.CommonMethods;


public class CashoutPage extends TestEngineClass{	
	
	public static void enterCellNumber() {
		WebDriver driver = driverLocal.get();
		CommonMethods.type(driver.findElement(cellNumber), "123");
	}
	
	public static void enterAddress() {
		WebDriver driver = driverLocal.get();
		CommonMethods.type(driver.findElement(deliveryAddr), "abc");
	}
	
	public static void clickButton() {
		WebDriver driver = driverLocal.get();
		CommonMethods.click(driver.findElement(cashoutSubmitButton));
	}
}
