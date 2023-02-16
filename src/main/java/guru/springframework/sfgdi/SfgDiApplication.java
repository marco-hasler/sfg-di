package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");


		System.out.println("--- Primary bean");
		System.out.println(myController.sayHello());

		System.out.println("------------------------------ Proberty Injected ");

		ProbertyInjectedController probertyInjectedController = (ProbertyInjectedController) ctx.getBean("probertyInjectedController");

		System.out.println(probertyInjectedController.getGreeting());

		System.out.println("------------------------------ Setter Injected");

		SetterinjectedController setterinjectedController = (SetterinjectedController) ctx.getBean("setterinjectedController");

		System.out.println(setterinjectedController.getGreeting());

		System.out.println("------------------------------ COnstructor Injected ");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
