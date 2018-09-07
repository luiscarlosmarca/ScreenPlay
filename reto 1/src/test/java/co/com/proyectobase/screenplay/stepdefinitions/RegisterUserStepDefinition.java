package co.com.proyectobase.screenplay.stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;

public class RegisterUserStepDefinition {
	@Managed (driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("carlos");
	
	@Given("^that Carlos want into to the web Automation Demo Site$")
	public void thatCarlosWantIntoToTheWebAutomationDemoSite() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	@When("^the does the register in the page$")
	public void theDoesTheRegisterInThePage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the verify that view the screen with text Double Click on Edit Icon to EDIT the Table Row$")
	public void theVerifyThatViewTheScreenWithTextDoubleClickOnEditIconToEDITTheTableRow() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
}
