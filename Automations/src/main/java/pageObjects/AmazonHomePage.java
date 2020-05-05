package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Amazon.Automations.base;

public class AmazonHomePage extends base {

	public void AmazonHomePage(WebDriver driver) {

		this.driver = driver;
	}
	
    String stringArr[]= {"link"};
   
    By signIn = By.id("nav-"+stringArr[0]+"-accountList");

	public WebElement getSignIn() {
		return driver.findElement(signIn);
		
	}

}
