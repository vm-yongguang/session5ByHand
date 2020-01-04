package qualifierexample.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import qualifierexample.service.PrintService;


@Component
public class Person {
	
	public Person() {
	}
	
	@Autowired
	//@Inject
	@Qualifier("smallll")
	PrintService printService;
	
	public void showMyFriends() {
		System.out.println(printService.showTheirName());
	}
}
