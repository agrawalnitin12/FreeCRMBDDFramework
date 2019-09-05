package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinition {
	
	@Before
	public void setup() {
		System.out.println("launch the browser");
		System.out.println("Enter URL for CRM App login");
	}
	
	@After
	public void teardown() {
		System.out.println("browser is closed");
	}

	@Given("^user is on deal page$")
	public void user_is_on_deal_page() {
	}

	@When("^user fills the deals form$")
	public void user_fills_the_deals_form() {
	}

	@Then("^Deal is created$")
	public void deal_is_created() {
	}
}
