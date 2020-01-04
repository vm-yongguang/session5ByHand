package qualifierexample.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import qualifierexample.model.Clerk;
import qualifierexample.model.Manager;
import qualifierexample.model.Person;

public class App {

	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new
		 * AnnotationConfigApplicationContext(AppConfiguration.class); Person personBean
		 * = context.getBean(Person.class); personBean.showMyFriends();
		 */

		AnnotationConfigApplicationContext context 
			= new AnnotationConfigApplicationContext();

		// Scan beans
		context.scan("qualifierexample.service");
		context.scan("qualifierexample.model");
		context.refresh();

//		VehicleService vehicle = context.getBean(VehicleService.class);
//		vehicle.service();
		
//		Person p = context.getBean(Person.class);
//		p.showMyFriends();

		Manager manager = context.getBean(Manager.class);
		manager.calculateSalary();

		Clerk clerk = context.getBean(Clerk.class);
		clerk.calculateSalary();

		context.close();

	}

}
