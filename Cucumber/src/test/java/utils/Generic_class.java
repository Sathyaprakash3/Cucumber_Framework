package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generic_class {
	public WebDriver driver;
	public Generic_class(WebDriver driver)
	{
		this.driver=driver;
	}
	public void switchwindow()
	{
		Set<String> s = driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		String parentWindow = i.next();
		String Childwindow = i.next();
		driver.switchTo().window(Childwindow);
	}
	
	public WebDriverWait wait(WebElement e)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(e));
		return wait;
	}
}
