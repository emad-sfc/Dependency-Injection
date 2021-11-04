package emad.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import emad.springframework.sfgdi.services.GreetingServices;

	@Controller
	public class I18nController {

	    private final GreetingServices greetingService;

	    public I18nController(@Qualifier("i18nService") GreetingServices greetingService) {
	        this.greetingService = greetingService;
	    }

	    public String sayHello(){
	        return greetingService.sayGreeting();
	    }
	}


