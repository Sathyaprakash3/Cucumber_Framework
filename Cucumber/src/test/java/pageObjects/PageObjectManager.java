package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager<Multiwindow_pageobjects> {
	public WebDriver driver;
	public Multiwindow_Pageobjects multi;
	public Dashboard_Pageobjects dash;
	public Textbox_Pageobjects text;
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	public Multiwindow_Pageobjects multiwindowoj()
	{
		multi = new Multiwindow_Pageobjects(driver);
		return multi;
	}
	public Dashboard_Pageobjects dashboardobj()
	{
		dash = new Dashboard_Pageobjects(driver);
		return dash;
	}
	
	public Textbox_Pageobjects autosuggobj()
	{
		text = new Textbox_Pageobjects(driver);
		return text;
	}

}
