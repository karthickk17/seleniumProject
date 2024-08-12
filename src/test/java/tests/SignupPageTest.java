//import testEngine.TestEngineClass;
package tests;

import org.testng.annotations.Test;

import pageObjects.*;

public class SignupPageTest extends SignupPage{
	
	@Test()
	public static void signupTest() throws InterruptedException {
		Thread.sleep(2000);
		clickSignupButton();
		Thread.sleep(2000);
		enterName();
		Thread.sleep(2000);
		enterEmail();
		Thread.sleep(2000);
		enterPassword();
		Thread.sleep(2000);
		clickButton();
		Thread.sleep(2000);
	}
	
	
}
