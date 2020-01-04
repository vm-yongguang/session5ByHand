package qualifierexample.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("manager")
public class ManagerService implements EmployeeService {
    public void calculateSalary() {
        System.out.println("calculating manager salary");
    }
}
