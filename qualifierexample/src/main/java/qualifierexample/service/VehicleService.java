package qualifierexample.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
	
	@Qualifier("bikeBean")
	private Vehicle vehicle;

	public void service() {
		vehicle.start();
		vehicle.stop();
	}
}
