package cucumber_Options;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;
import utils.Generic_class;
import utils.TestBase;

public class Test_Context {
	public WebDriver driver;
	public PageObjectManager pageobj;
	public TestBase testBase;
	public Generic_class generic;
	public Test_Context() throws IOException
	{
		testBase = new TestBase();
		pageobj = new PageObjectManager(testBase.WebManager());
		generic = new Generic_class(testBase.WebManager());
	}

}
