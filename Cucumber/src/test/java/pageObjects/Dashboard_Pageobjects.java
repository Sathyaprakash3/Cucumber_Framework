package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard_Pageobjects {
	public WebDriver driver;
	public Dashboard_Pageobjects(WebDriver driver)
	{
		this.driver=driver;
	}
	By Menu = By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']");
	By window = By.xpath("//span[contains(text() , 'Window')]");
	By element = By.xpath("//i[@class='pi pi-server layout-menuitem-icon']");
	By Textbox = By.xpath("//span[text()='Text Box']");
	By Search = By.xpath("//input[@placeholder='Search']");
	By suggestioncheck = By.xpath("ui-autocomplete-token-label");
	
	public void menu()
	{
		driver.findElement(Menu).click();
	}
	public void window()
	{
		driver.findElement(window).click();
	}
	public void element()
	{
		driver.findElement(element).click();
	}
	
	public void textbox()
	{
		driver.findElement(Textbox).click();
	}
	
	
	

}
