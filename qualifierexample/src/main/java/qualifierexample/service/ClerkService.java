package qualifierexample.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("clerk")
public class ClerkService implements EmployeeService {
    public void calculateSalary() {
        System.out.println("calculating clerk salary");
    }
}
