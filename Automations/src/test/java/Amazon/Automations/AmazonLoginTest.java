package Amazon.Automations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.AmazonHomePage;

public class AmazonLoginTest extends base {
	
	public static WebDriver driver;
	AmazonHomePage AmazonHomePagePO =new AmazonHomePage();
	
	@Test
	public void amazonLoginPageVerification() throws IOException
	{
		driver= webDriverIntialization();
		driver.get("https://www.amazon.in/");
        getScreenshot("amazonLoginPageVerification");
        AmazonHomePagePO.getSignIn().click();
        getScreenshot("signIn");
		
	}

}
