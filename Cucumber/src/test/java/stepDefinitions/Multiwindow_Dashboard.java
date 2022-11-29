package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;

import cucumber_Options.Test_Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.Multiwindow_Pageobjects;

public class Multiwindow_Dashboard {
	public Test_Context Testcontext;
	Multiwindow_Pageobjects mul;

	public Multiwindow_Dashboard(Test_Context Testcontext) {
		this.Testcontext = Testcontext;
		mul = Testcontext.pageobj.multiwindowoj();
	}

	@And("^press open button in Click and Confirm new Window$")
	public void press_open_button_in_click_and_confirm_new_window() {
		/*
		 * System.out.println("Check2"); Testcontext.pageobj.multi.windows();
		 * Set<String> s = Testcontext.driver.getWindowHandles(); Iterator<String> i =
		 * s.iterator(); String parentWindow = i.next(); String Childwindow = i.next();
		 * Testcontext.driver.switchTo().window(Childwindow);
		 */
		mul.windows();
		switch_window();
	}
	
	public void switch_window()
	{
		Testcontext.generic.switchwindow();
	}

	@Then("^other page is opens$")
	public void other_page_is_opens() {
		System.out.println("Check3");
		mul.layout_btn();

	}

	@Then("^while clicking setting layoutmenu was displayed$")
	public void while_clicking_setting_layoutmenu_was_displayed() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(mul.layout_menu());
	}

}
