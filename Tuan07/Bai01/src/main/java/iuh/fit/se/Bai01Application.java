package iuh.fit.se;

import dao.employeesDao;
import entyties.employees;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = {"dao","dao.impl"})
public class Bai01Application {

    public static void main(String[] args) {

        SpringApplication.run(Bai01Application.class, args);
    }
    @Bean
    CommandLineRunner runner (employeesDao employeesDao){
        return args -> {
            employees employees = new employees("Quan Ly", "Nguyen Thanh Hiep2");
            employeesDao.save(employees);
            List<employees> list = new ArrayList<employees>();
            list = employeesDao.getAll();
            System.out.println(list);

        };
    }

}
