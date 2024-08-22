package pageObjects;

import testEngine.*;
import static businessComponents.common.*;

import businessComponents.CommonMethods;

import java.security.SecureRandom;

import org.openqa.selenium.WebDriver;


public class SignupPage extends TestEngineClass{

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom random = new SecureRandom();

    public static String generateRandomString(int prefixLength, int domainLength, int tldLength) {
        StringBuilder result = new StringBuilder();

        // Generate the prefix part (before the @)
        for (int i = 0; i < prefixLength; i++) {
            int index = random.nextInt(CHARACTERS.length());
            result.append(CHARACTERS.charAt(index));
        }

        result.append('@'); // Add the '@' character

        // Generate the domain part (between @ and .)
        for (int i = 0; i < domainLength; i++) {
            int index = random.nextInt(CHARACTERS.length());
            result.append(CHARACTERS.charAt(index));
        }

        result.append('.'); // Add the '.' character

        // Generate the TLD part (after the .)
        for (int i = 0; i < tldLength; i++) {
            int index = random.nextInt(CHARACTERS.length());
            result.append(CHARACTERS.charAt(index));
        }

        return result.toString();
	}

	public static void clickSignupButton() {
		WebDriver driver = driverLocal.get();
		CommonMethods.click(driver.findElement(signupLink));
	}
	
	public static void enterName() {
		WebDriver driver = driverLocal.get();
		CommonMethods.type(driver.findElement(signupName), "Karthick");
	}
	
	public static void enterEmail() {
		
		int prefixLength = 8;  // Length of the characters before the '@'
        int domainLength = 5;  // Length of the characters between '@' and '.'
        int tldLength = 3;     // Length of the characters after the '.'

        String randomString = generateRandomString(prefixLength, domainLength, tldLength);
        System.out.println("Random String: " + randomString);
        
        WebDriver driver = driverLocal.get();
		CommonMethods.type(driver.findElement(signupEmail), randomString);
	}
	
	public static void enterPassword() {
		WebDriver driver = driverLocal.get();
		CommonMethods.type(driver.findElement(signupPassword), "123456");
	}
	
	public static void clickButton() {
		WebDriver driver = driverLocal.get();
		CommonMethods.click(driver.findElement(submitButton));
	}
}
