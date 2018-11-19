package co.com.proyectobase.screenplay.stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.tasks.OpenWeb;
import co.com.proyectobase.screenplay.tasks.Register;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;


public class RegisterUserStepDefinition {
	@Managed (driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("carlos");
	@Before
	public void connfigBegin() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	@Given("^that Carlos want into to the web Automation Demo Site$")
	public void thatCarlosWantIntoToTheWebAutomationDemoSite() throws Exception {
	   carlos.wasAbleTo(OpenWeb.DemoPage());
	}

	@When("^the does the register in the page$")
	public void theDoesTheRegisterInThePage(List<List<String>> data) {
			
		 
		 System.out.println(data.get(0));
		 //carlos.attemptsTo(Register.PageDemo(datanew));
	}
	
	/*
	@When("^the does the register in the page$")
	public void theDoesTheRegisterInThePage(DataTable dataInput) {
				
		List<List<String>> data = dataInput.raw();
		for(int i=1; i<data.size(); i++){
			System.out.println(data);
			carlos.attemptsTo(Register.PageDemo(data,i));
		}
	}*/

	@Then("^the verify that view the screen with text Double Click on Edit Icon to EDIT the Table Row$")
	public void theVerifyThatViewTheScreenWithTextDoubleClickOnEditIconToEDITTheTableRow() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
}
