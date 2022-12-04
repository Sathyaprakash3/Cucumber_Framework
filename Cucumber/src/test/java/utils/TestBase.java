package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber_Options.Test_Context;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	public WebDriver driver;
	public Properties prop;
	public WebDriver WebManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "//src//test//Resources//config.properties");
		prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("URL");
		String browser_properties = prop.getProperty("Browser");
		String browser_maven=System.getProperty("browser");
		// result = testCondition ? value1 : value2
		
		String browser = browser_maven!=null ? browser_maven : browser_properties;
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("Chrome"))
			{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			}
			if(browser.equalsIgnoreCase("Firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}

}
