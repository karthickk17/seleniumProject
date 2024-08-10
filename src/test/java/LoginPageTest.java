import testEngine.TestEngineClass;

import org.testng.annotations.Test;

import pageObjects.*;

public class LoginPageTest extends LoginPage{

	@Test()
	public static void loginTest() throws InterruptedException {
		clickLoginButton();
		Thread.sleep(2000);
		enterEmail();
		Thread.sleep(2000);
		enterPassword();
		Thread.sleep(2000);
		clickButton();
		Thread.sleep(2000);
	}
	
	
}
