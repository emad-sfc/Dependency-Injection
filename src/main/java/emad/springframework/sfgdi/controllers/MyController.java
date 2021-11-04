package emad.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import emad.springframework.sfgdi.services.GreetingServices;

@Controller
public class MyController {
	private final GreetingServices greetingServices;

	public MyController(GreetingServices greetingServices) {
		super();
		this.greetingServices = greetingServices;
	}

	public String sayHello() {
		return (greetingServices.sayGreeting());
	}

}
