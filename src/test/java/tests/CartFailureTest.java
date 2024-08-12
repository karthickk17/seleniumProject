package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import businessComponents.*;
public class CartFailureTest extends HomePage{

	@Test
    public void testCartIconAfterRemovingProduct() throws InterruptedException {
        
		//Log into your account
		CommonMethods.waitTime(1000);
		LoginPage.clickLoginButton();
		
		CommonMethods.waitTime(1000);
		LoginPage.enterEmail("karthickk@gmail.com");
		
		CommonMethods.waitTime(1000);
		LoginPage.enterPassword();
		
		CommonMethods.waitTime(1000);
		LoginPage.clickButton();
		
		CommonMethods.waitTime(5000);
		addProduct();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("Toastify__toast-container")));
		goToCartPage();
		CommonMethods.waitTime(1000);

        // Remove product from cart (adjust the locator as needed)
        WebElement deleteButtonElement = wait.until(ExpectedConditions.elementToBeClickable(common.deleteButton));
        deleteButtonElement.click();

        // Navigate back to home page
        WebElement homePageLinkElement = wait.until(ExpectedConditions.elementToBeClickable(common.homePageLink));
        homePageLinkElement.click();
        

        // Check cart icon count
        WebElement cartIconCount = wait.until(ExpectedConditions.presenceOfElementLocated(common.cartCount));
        String count = cartIconCount.getText();

        
        System.out.println("The cart count is displayed as: " + count);
        
        if(count.equals("0")) {
        	System.out.println("True! Both are same");
        }
        // Assert that the cart icon displays 0
        Assert.assertEquals(count, "0", "Cart icon should display 0 after removing the product");
    }

}
