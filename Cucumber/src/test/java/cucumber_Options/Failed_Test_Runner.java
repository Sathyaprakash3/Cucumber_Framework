package cucumber_Options;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="@target/failed_scenarios.txt",glue ="stepDefinitions" , monochrome = true, dryRun = false , 
plugin = {"html:target/reports.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",})
public class Failed_Test_Runner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
