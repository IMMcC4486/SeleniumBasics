package cuke;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MOREstuffANDthings {

	
	@Given("^go to homepage$")
	public void go_to_homepage() throws Throwable {
	    System.out.println("HAPPY");
	}

	@When("^click login$")
	public void click_login() throws Throwable {
	   System.out.println("FUN");
	}

	@Then("^get to homepage$")
	public void get_to_homepage() throws Throwable {
	    System.out.println("TIME");
	}
}
