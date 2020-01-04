package qualifierexample.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import qualifierexample.service.Vehicle;

@Component
@Qualifier("bikeBean")
public class Bike implements Vehicle {

	public void start() {
		 System.out.println("Bike started");
		
	}

	public void stop() {
		 System.out.println("Bike stopped");
		
	}

}
