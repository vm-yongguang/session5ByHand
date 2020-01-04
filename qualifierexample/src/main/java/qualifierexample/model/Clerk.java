package qualifierexample.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import qualifierexample.service.EmployeeService;

@Component
public class Clerk implements Employee {
    @Autowired
    @Qualifier("clerk")
    private EmployeeService employeeService;

    public void calculateSalary() {
        employeeService.calculateSalary();
    }
}
