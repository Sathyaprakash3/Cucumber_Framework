package stepDefinitions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber_Options.Test_Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Dashboard_Pageobjects;

public class Dashboard_StepDefinition {
	public Test_Context Testcontext;
	Dashboard_Pageobjects dashboard;

	public Dashboard_StepDefinition(Test_Context Testcontext) {
		this.Testcontext = Testcontext;
		dashboard = this.Testcontext.pageobj.dashboardobj();
		
	}

	@Given("^Go to Leaf ground page$")
	public void go_to_leaf_ground_page() throws Throwable {

		System.out.println("hello");
		/*
		 * WebDriverManager.chromedriver().setup(); Testcontext.driver = new
		 * ChromeDriver();
		 * Testcontext.driver.get("https://leafground.com/dashboard.xhtml");
		 * Testcontext.driver.manage().window().maximize();
		 * Testcontext.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 */

	}

	@When("^window was selected from browser menu$")
	public void window_was_selected_from_browser_menu() {
		System.out.println("Check1");
		dashboard.menu();
		dashboard.window();
		

	}
}
