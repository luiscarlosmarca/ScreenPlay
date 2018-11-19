package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import co.com.proyectobase.screenplay.userinterface.DemoPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {
	//instanciar los objetos recibidos dentro de la clase
	
	private List<String> data;
	public Register(List data) {
		this.data=data;
	}
	
	//id=null
	//data=[null]
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(data.get(0).trim()).into(DemoPage.fullname));
				
	}
	public static Register PageDemo(List<String> data) { // [[e1,e2,e3,e4],[v1,v2,v3,v4]]
		// TODO Auto-generated method stub
		return Tasks.instrumented(Register.class);
	}


	
}
