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
	
}
