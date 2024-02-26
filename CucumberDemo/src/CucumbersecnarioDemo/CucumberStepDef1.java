package CucumbersecnarioDemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberStepDef1 
{


	@Given("^User able to open the browser$")
	public void User_able_to_open_the_browser() throws Throwable 
	{
		System.out.println("^User able to open the browser$");   
	}

	@Given("^User able to enter the url$")
	public void User_able_to_enter_the_url() throws Throwable 
	{
		System.out.println("^User able to enter the url$");   
	}

	@When("^User able to enter the username$")
	public void User_able_to_enter_the_username() throws Throwable 
	{
		System.out.println("^User able to enter the username$");   
	}

	@When("^User able to enter the password$")
	public void User_able_to_enter_the_password() throws Throwable 
	{
		System.out.println("^User able to enter the password$");   
	}

	@When("^User able to click on the submit button$")
	public void User_able_to_click_on_the_submit_button() throws Throwable 
	{
		System.out.println("^User able to click on the submit button$");   
	}

	@Then("^verify the login is successful$")
	public void verify_the_login_is_successful() throws Throwable 
	{
		System.out.println("^verify the login is successful$");   
	}

	@Then("^verify the homescreen$")
	public void verify_the_homescreen() throws Throwable 
	{

		System.out.println("^verify the homescreen$");  

	}
}

