package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import cucumber_Options.Test_Context;

public class hooks {
Test_Context testContextSetup;
	
	public hooks(Test_Context testContextSetup)
	{
		
		this.testContextSetup = testContextSetup;
	}
	@After
	public void AfterScenario() throws IOException
	{
		
		testContextSetup.testBase.WebManager().quit();
		
	}
	
	@AfterStep
	public void Addscreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver =testContextSetup.testBase.WebManager();
			if(scenario.isFailed())
			{
				File Sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				byte[] converted = FileUtils.readFileToByteArray(Sourcepath);
				scenario.attach(converted, "image/png", "image");
			}
	}
	

}
