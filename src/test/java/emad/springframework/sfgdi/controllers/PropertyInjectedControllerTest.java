package emad.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import emad.springframework.sfgdi.services.ConstructorGreetingServices;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingServices = new ConstructorGreetingServices();
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
