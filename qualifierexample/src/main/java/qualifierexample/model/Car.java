package qualifierexample.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import qualifierexample.service.Vehicle;

@Component
@Qualifier("carBean")
public class Car implements Vehicle {
	
	public void start() {
		System.out.println("Car started");
	}

	public void stop() {
		System.out.println("Car stopped");
	}
}
