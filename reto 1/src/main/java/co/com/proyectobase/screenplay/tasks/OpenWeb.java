package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.DemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenWeb implements Task{
	private DemoPage registerDemo;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.attemptsTo(Open.browserOn(registerDemo));
		
		
		
	}

	public static OpenWeb DemoPage() {
		// TODO Auto-generated method stub
		
		return Tasks.instrumented(OpenWeb.class);
	}
	

}
