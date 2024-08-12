package pageObjects;

import testEngine.*;
import static businessComponents.common.*;

import businessComponents.CommonMethods;


public class LoginPage extends TestEngineClass{

	public static void clickLoginButton() {
		CommonMethods.click(driver.findElement(loginLink));
	}
	
	
	public static void enterEmail() {
		CommonMethods.type(driver.findElement(emailTextBox), "karthick@gmail.com");
	}
	
	public static void enterPassword() {
		CommonMethods.type(driver.findElement(passwordTextBox), "123456");
	}
	
	public static void clickButton() {
		CommonMethods.click(driver.findElement(loginButton));
	}
}
