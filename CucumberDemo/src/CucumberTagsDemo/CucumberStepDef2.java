package CucumberTagsDemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberStepDef2 
{


	@Given("^I want to write a step with \"([^\"]*)\"$")
	public void I_want_to_write_a_step_with(String username) throws Throwable 
	{
		//System.out.println("^I want to write a step with \"([^\"]*)\"$");	
		System.out.println("username:"+username);	
	}

	@When("^I check for the \"([^\"]*)\" in step$")
	public void I_check_for_the_in_step(String password) throws Throwable 
	{
		//	System.out.println("^I check for the \"([^\"]*)\" in step$");
		System.out.println("password:"+password);	

	}

	@Then("^I verify the \"([^\"]*)\" in step$")
	public void I_verify_the_in_step(String status) throws Throwable 
	{
		//System.out.println("^I verify the \"([^\"]*)\" in step$");
		System.out.println("status:"+status);	


	}
}
