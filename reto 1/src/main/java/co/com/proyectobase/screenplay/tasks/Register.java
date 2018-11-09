package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Register implements Task {
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
	}
	public static Register PageDemo() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Register.class);
	}


	
}
