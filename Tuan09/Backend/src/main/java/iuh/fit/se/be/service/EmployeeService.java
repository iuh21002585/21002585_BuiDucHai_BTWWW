package iuh.fit.se.be.service;

import iuh.fit.se.be.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);
    Employee findById(Long id);
    Employee create(Employee e);
    Employee update(Long id, Employee e);
    void delete(Long id);
}
