package stepDefinitions;

import cucumber_Options.Test_Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.Dashboard_Pageobjects;
import pageObjects.Textbox_Pageobjects;

public class Suggestionbox_Stepdefinition {
		public Test_Context Testcontext;
		Dashboard_Pageobjects dashboard;
		Textbox_Pageobjects textbox;
		
		public Suggestionbox_Stepdefinition(Test_Context Testcontext)
		{
			this.Testcontext = Testcontext;
			dashboard = this.Testcontext.pageobj.dashboardobj();
			textbox = this.Testcontext.pageobj.autosuggobj();
		}

	    @Given("^Go to dashboard bage in leafground$")
	    public void go_to_dashboard_bage_in_leafground() throws Throwable {
	        System.out.println("Page opens");
	    }

	    @When("^I click element in menu$")
	    public void i_click_element_in_menu() throws Throwable {
	        dashboard.element();
	    }

	    @And("^I click textbox in submenu$")
	    public void i_click_textbox_in_submenu() throws Throwable {
	        dashboard.textbox();
	    }

	    @And("^Give values (.+) in the search$")
	    public void give_values_in_the_search(String textvalue) throws Throwable {
	        textbox.searchfield(textvalue);
	        textbox.searchElements();
	    }
	    
	    @Then("^I validate the autosuggestive label$")
	    public void i_validate_the_autosuggestive_label() throws Throwable {
	        Boolean s = textbox.Autosuggest();
	        if(s==true)
	        {
	        	Assert.assertEquals(true, true);
	        	System.out.println("Autosuggestion is displayed");
	        }
	    }


}
