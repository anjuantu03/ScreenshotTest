package Amazon.Automations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static WebDriver driver;

	public static WebDriver webDriverIntialization() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Anju\\git\\localFramework\\Automation\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Anju\\Documents\\Automation Files\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			// path to FF driver
		} else if (browserName.equals("IE")) {
			// path to IE driver
		} else {
			System.out.println("Please check your browser name in data file!!");
		}

		return driver;

	}

	public void getScreenshot(String testmethodName) throws IOException {
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		String time = dateFormat.format(now);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(
				"C:\\Users\\Anju\\Documents\\Eclipse projects\\Automations\\Screenshots\\" + testmethodName +"_"+time+ ".png"));

	}

}
