package emad.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import emad.springframework.sfgdi.services.ConstructorGreetingServices;

class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingServices(new ConstructorGreetingServices());
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
