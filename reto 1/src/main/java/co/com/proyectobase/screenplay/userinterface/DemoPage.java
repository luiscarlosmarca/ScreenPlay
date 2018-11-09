package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class DemoPage extends PageObject{
	
	
	//Campos de usuario
	public static final Target fullname = Target.the("field text full name").located(By.xpath("//INPUT[@type='text'])[1]"));
	public static final Target lastname = Target.the("field text lasta name").located(By.xpath("//INPUT[@type='text'])[2"));
	public static final Target address = Target.the("field text address").located(By.xpath("//TEXTAREA[@rows='3'][text()=' ']"));
	public static final Target email = Target.the("field text email").located(By.xpath("//INPUT[@type='email']"));
	public static final Target phone = Target.the("field text phone").located(By.xpath("//INPUT[@type='tel']"));
	public static final Target gender = Target.the("field text gender").located(By.xpath("//INPUT[@type='radio'])[1]"));
	public static final Target hobbies = Target.the("field text hobbies").located(By.xpath("//INPUT[@id='checkbox1']"));
	public static final Target languages = Target.the("field text languages").located(By.xpath("//DIV[@id='msdd']"));
	public static final Target skills = Target.the("field text skills").located(By.xpath("//SELECT[@id='Skills']"));
	public static final Target country = Target.the("field text country").located(By.xpath("//SELECT[@id='countries']"));
	public static final Target dept = Target.the("field text dept").located(By.xpath("//SPAN[@id='select2-country-container']"));
	public static final Target year = Target.the("field text year").located(By.xpath("//SELECT[@id='yearbox']"));
	public static final Target month = Target.the("field text month").located(By.xpath("//SELECT[@type='text'])[4]"));
	public static final Target day = Target.the("field text day").located(By.xpath("//SELECT[@id='daybox']"));
	public static final Target password = Target.the("field text password").located(By.xpath("//INPUT[@id='firstpassword']"));
	public static final Target password_confirm = Target.the("field text password_confirm").located(By.xpath("//INPUT[@id='secondpassword']"));
	
	

	
		

}
