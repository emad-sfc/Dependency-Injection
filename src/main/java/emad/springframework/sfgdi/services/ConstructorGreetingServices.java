package emad.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServices implements GreetingServices {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - Constructor";
	}

}
