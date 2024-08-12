//import testEngine.TestEngineClass;
package tests;

import org.testng.annotations.Test;

import businessComponents.CommonMethods;
import pageObjects.*;

public class SignupPageTest extends SignupPage{
	
	@Test()
	public static void signupTest() throws InterruptedException {
		CommonMethods.waitTime(1000);
		clickSignupButton();
		CommonMethods.waitTime(1000);
		enterName();
		CommonMethods.waitTime(1000);
		enterEmail();
		CommonMethods.waitTime(1000);
		enterPassword();
		CommonMethods.waitTime(1000);
		clickButton();
		CommonMethods.waitTime(1000);
	}
	
	
}
