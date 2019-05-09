package cuke;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SomethingRandom {

	
	@Given("^ago to homepage$")
	public void go_to_homepage() throws Throwable {
	    System.out.println("GIVEN");
	}

	@When("^aclick login$")
	public void click_login() throws Throwable {
	   System.out.println("WHEN");
	}

	@Then("^aget to homepage$")
	public void get_to_homepage() throws Throwable {
	    System.out.println("THEN");
	}
}
