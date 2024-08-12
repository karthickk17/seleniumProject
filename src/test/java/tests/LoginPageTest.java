//import testEngine.TestEngineClass;
package tests;

import org.testng.annotations.Test;

import pageObjects.*;

public class LoginPageTest extends LoginPage{
	
	@Test()
	public static void loginTest() throws InterruptedException {
		Thread.sleep(2000);
		clickLoginButton();
		Thread.sleep(2000);
		enterEmail("karthick@gmail.com");
		Thread.sleep(2000);
		enterPassword();
		Thread.sleep(2000);
		clickButton();
	}
	
	
}
