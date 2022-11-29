package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Textbox_Pageobjects {
	public WebDriver driver;
	public Textbox_Pageobjects(WebDriver driver)
	{
		this.driver=driver;
	}
	By Search = By.xpath("//input[@placeholder='Search']");
	By suggestioncheck = By.xpath("//span[@class='ui-autocomplete-token-label']");
	By Searchelements = By.xpath("//li[@role='option']");
	public void searchfield(String name)
	{
		driver.findElement(Search).sendKeys(name);
		
	}
	
	public Boolean Autosuggest()
	{
		Boolean autosuggest = driver.findElement(suggestioncheck).isDisplayed();
		return autosuggest;
	}
	
	public void searchElements()
	{
		List<WebElement> data = driver.findElements(Searchelements);
		for(WebElement searchdata : data)
		{
			if(searchdata.getText().equalsIgnoreCase("india1"))
			{
				driver.findElement(Searchelements).click();
			}
			else if(searchdata.getText().equalsIgnoreCase("user20"))
			{
				driver.findElement(Searchelements).click();
			}
		}
	}

}
