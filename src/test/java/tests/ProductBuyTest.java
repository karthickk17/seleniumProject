//import testEngine.TestEngineClass;
package tests;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.CartProductsPage;
import pageObjects.CashoutPage;
import businessComponents.CommonMethods;


public class ProductBuyTest extends HomePage{
	
	@Test()
	public static void addProductTest() throws InterruptedException {
		
		
		CommonMethods.waitTime(1000);
		LoginPage.clickLoginButton();
		
		CommonMethods.waitTime(1000);
		LoginPage.enterEmail("karthick@gmail.com");
		
		LoginPage.enterPassword();
		CommonMethods.waitTime(1000);
		
		LoginPage.clickButton();
		
		
		CommonMethods.waitTime(5000);
		addProduct();
		
		CommonMethods.waitTime(7000);
		WebDriver driver = driverLocal.get();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("Toastify__toast-container")));
		goToCartPage();
		
		CommonMethods.waitTime(1000);
		
		CartProductsPage.clickButton();
		
		CommonMethods.waitTime(1000);
		CashoutPage.enterCellNumber();
		
		CommonMethods.waitTime(1000);
		CashoutPage.enterAddress();
		
		CommonMethods.waitTime(1000);
		CashoutPage.clickButton();
		CommonMethods.waitTime(1000);
		
	}
	
	
}
