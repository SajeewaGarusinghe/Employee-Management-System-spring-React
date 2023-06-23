package com.example.backend;

import com.example.backend.model.Employee;
import com.example.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);


    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
//        Employee employee = new Employee();
//        employee.setFirstName("Sajeewa");
//        employee.setLastName("Garusinghe");
//        employee.setEmailId("sajeeva616@gmail.com");
//        employeeRepository.save(employee);
//
//        Employee employee1 = new Employee();
//        employee1.setFirstName("Sajeewa");
//        employee1.setLastName("Garusinghe");
//        employee1.setEmailId("sajeeva616@gmail.com");
//        employeeRepository.save(employee1);
//
//        Employee employee2 = new Employee();
//        employee2.setFirstName("Sajeewa");
//        employee2.setLastName("Garusinghe");
//        employee2.setEmailId("sajeeva616@gmail.com");
//        employeeRepository.save(employee2);
    }

}
