package org.stepdefinition;

import org.bc.BaseClass;
import org.pojo.FBLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class FB extends BaseClass {
	FBLoginPojo f;
	@Given("user has to launch the browser and max the window")
	public void user_has_to_launch_the_browser_and_max_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("user has to lauch the URL")
	public void user_has_to_lauch_the_URL() {
	   launchUrl("https://en-gb.facebook.com/");
	}

	@When("user has to pass the {string} email field")
	public void user_has_to_pass_the_email_field(String em) {
	    f = new FBLoginPojo();
	    passText(em, f.getEmail());
	}

	@When("user has to pass the {string} password field")
	public void user_has_to_pass_the_password_field(String pass) {
	    f = new FBLoginPojo();
	    passText(pass, f.getPassword());
	}

	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {
	    clickBtn(f.getLoginbt());
	}

	@Then("close the browser")
	public void close_the_browser() {
	    closeEntireBrowser();
	}


	
}
