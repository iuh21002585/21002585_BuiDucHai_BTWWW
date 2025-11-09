package iuh.fit.se.reponsitories;

import iuh.fit.se.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeReponsitoties extends JpaRepository<Employees, Integer> {

}
