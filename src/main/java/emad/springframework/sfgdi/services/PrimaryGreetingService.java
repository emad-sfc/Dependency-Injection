package emad.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingServices{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello Wolrd - Primary Bean";
	}

}
