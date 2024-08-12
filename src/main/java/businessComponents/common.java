package businessComponents;

import org.openqa.selenium.By;

public class common {

	public static final String url = "https://grocery-glide.vercel.app";
	
	//Login elements
	public static final By loginLink = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/span[2]/a");
	public static final By loginText = By.xpath("//*[@id=\"root\"]/div/div/h2");
	public static final By emailTextBox = By.xpath("//*[@id=\"root\"]/div/div/form/input[1]");
	public static final By passwordTextBox = By.xpath("//*[@id=\"root\"]/div/div/form/input[2]");
	public static final By loginButton = By.xpath("//*[@id=\"root\"]/div/div/form/div/button");
	
	//Sign up elements
	public static final By signupLink = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/span[1]/a");
	public static final By signupName = By.xpath("//*[@id=\"root\"]/div/div/form/input[1]");
	public static final By signupEmail = By.xpath("/html/body/div[1]/div/div/form/input[2]");
	public static final By signupPassword = By.xpath("//*[@id=\"root\"]/div/div/form/input[3]");
	public static final By submitButton = By.xpath("//*[@id=\"root\"]/div/div/form/div/button");
	
	//Home Page elements
	public static final By addToCart = By.xpath("/html/body/div/div/div[3]/div[4]/div[1]/div[3]/div[2]/button");
	public static final By cartPagelink = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/span[2]/a");
	public static final By cartCount = By.className("no-of-products");
	
	//Cart products page elements
	public static final By cashOnDeliveryButton = By.className("cashout-link");
	public static final By deleteButton = By.className("delete-btn");
	public static final By homePageLink = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/a");
	
	//Cashout Page elements
	public static final By cellNumber = By.xpath("//*[@id=\"root\"]/div[2]/form/input[3]");
	public static final By deliveryAddr = By.xpath("//*[@id=\"root\"]/div[2]/form/input[4]");
	public static final By cashoutSubmitButton = By.xpath("//*[@id=\"root\"]/div[2]/form/div/button");
	
	
	
}
