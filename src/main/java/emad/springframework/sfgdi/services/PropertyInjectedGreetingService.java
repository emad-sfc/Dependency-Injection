package emad.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingServices {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - Property";
	}
}
