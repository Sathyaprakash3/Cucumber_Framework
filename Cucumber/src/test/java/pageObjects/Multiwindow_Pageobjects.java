package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Multiwindow_Pageobjects {
	public WebDriver driver;
	public Multiwindow_Pageobjects(WebDriver driver)
	{
		this.driver=driver;
	}
	By windows = By.xpath("//span[@class='ui-button-text ui-c']");
	By layoutbtn = By.id("layout-config-button");
	By layoutmenu = By.xpath("//div[@class='layout-config layout-config-active']");
	
	public By windows()
	{
		driver.findElement(windows).click();
		return layoutmenu;
	}
	public void layout_btn()
	{
		driver.findElement(layoutbtn).click();
	}
	public Boolean layout_menu()
	{
		return driver.findElement(layoutmenu).isDisplayed();
	}

}
