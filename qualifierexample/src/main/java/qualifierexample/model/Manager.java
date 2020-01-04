package qualifierexample.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import qualifierexample.service.ManagerService;

@Component
public class Manager implements Employee {
    @Autowired
    @Qualifier("manager")
    private ManagerService managerService;

    public void calculateSalary() {
        managerService.calculateSalary();
    }
}
