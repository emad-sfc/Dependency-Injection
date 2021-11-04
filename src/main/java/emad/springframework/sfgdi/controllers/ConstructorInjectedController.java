package emad.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import emad.springframework.sfgdi.services.GreetingServices;

@Controller
public class ConstructorInjectedController {

	private final GreetingServices greetingServices;

	public ConstructorInjectedController(@Qualifier("constructorGreetingServices")GreetingServices greetingServices) {
		this.greetingServices = greetingServices;
	}

	public String getGreeting() {
		return greetingServices.sayGreeting();
	}


}
