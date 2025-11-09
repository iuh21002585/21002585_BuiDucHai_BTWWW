package iuh.fit.se;

import iuh.fit.se.entities.Employees;
import iuh.fit.se.services.EmployeeServieces;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Bai2Application {

    public static void main(String[] args) {
        SpringApplication.run(Bai2Application.class, args);
    }
    @Bean
    CommandLineRunner runner(EmployeeServieces employeeServieces){
        return args -> {
            Employees employees = new Employees();
            employees.setName("Bui Duc Hai");
            employees.setRole("abc abc");

            employeeServieces.save(employees);
            List<Employees> list = new ArrayList<Employees>();
            list = employeeServieces.findAll();
            list.forEach(employees1 -> {
                System.out.println(employees1.getName());
                System.out.println(employees1.getRole());
            });
        };
    }
}
