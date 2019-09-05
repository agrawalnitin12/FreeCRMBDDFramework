package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedhookStepDefinition {
	
	//Global hooks
	@Before
	public void setup() {
		System.out.println("launch the browser");
		System.out.println("Enter URL for CRM App login");
	}
	
	//Global hooks
	@After
	public void teardown() {
		System.out.println("browser is closed");
	}
	
	@Before("@First")
	public void beforefirst() {
	System.out.println("before first scenario");
	}
		
	@After("@First")
	public void afterfirst() {
		System.out.println("after first scenario");
	}

	@Before("@Second")
	public void beforesecond() {
		System.out.println("before second scenario");
	}
		
	@After("@Second")
	public void aftersecond() {
		System.out.println("after second scenario");
	}
	
	@Before("@Third")
	public void beforethird() {
		System.out.println("before third scenario");
	}
		
	@After("@Third")
	public void afterthird() {
		System.out.println("after third scenario");
	}
	
	@Given("^This is the first step$")
	public void this_is_the_first_step() {
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() {
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() {
	}
	
}
