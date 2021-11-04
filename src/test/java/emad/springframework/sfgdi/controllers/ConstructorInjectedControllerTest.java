package emad.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import emad.springframework.sfgdi.services.ConstructorGreetingServices;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller =  new ConstructorInjectedController(new ConstructorGreetingServices());

	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
