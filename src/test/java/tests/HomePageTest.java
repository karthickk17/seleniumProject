//import testEngine.TestEngineClass;
package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class HomePageTest extends HomePage{
	
	@Test()
	public static void addProductTest() throws InterruptedException {
		LoginPage.clickLoginButton();
		LoginPage.enterEmail();
		LoginPage.enterPassword();
		LoginPage.clickButton();
		Thread.sleep(5000);
		addProduct();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("Toastify__toast-container")));
		goToCartPage();
		Thread.sleep(2000);
	}
	
	
}
