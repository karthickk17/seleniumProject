package pageObjects;

import testEngine.*;
import static businessComponents.common.*;

import org.openqa.selenium.WebDriver;

import businessComponents.CommonMethods;


public class LoginPage extends TestEngineClass{

	public static void clickLoginButton() {
		WebDriver driver = driverLocal.get();
		CommonMethods.click(driver.findElement(loginLink));
	}
	
	
	public static void enterEmail(String email) {
		WebDriver driver = driverLocal.get();
		CommonMethods.type(driver.findElement(emailTextBox), email);
	}
	
	public static void enterPassword() {
		WebDriver driver = driverLocal.get();
		CommonMethods.type(driver.findElement(passwordTextBox), "123456");
	}
	
	public static void clickButton() {
		WebDriver driver = driverLocal.get();
		CommonMethods.click(driver.findElement(loginButton));
	}
}
