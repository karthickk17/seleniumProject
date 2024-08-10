package pageObjects;

import org.openqa.selenium.WebElement;

public class CommonMethods {

	public static void click(WebElement element) {
		
		element.click();
		
	}
	
	public static void type(WebElement element, String text) {
		
		element.sendKeys(text);
		
	}
	
}
