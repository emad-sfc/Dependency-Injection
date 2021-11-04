package emad.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import emad.springframework.sfgdi.services.GreetingServices;

@Controller
public class SetterInjectedController {

	@Qualifier("setterInjectedGreetingService")
	@Autowired
	private GreetingServices greetingServices;


	public void setGreetingServices( GreetingServices greetingServices) {
		this.greetingServices = greetingServices;
	}

	public String getGreeting() {
		return greetingServices.sayGreeting();
	}



}
