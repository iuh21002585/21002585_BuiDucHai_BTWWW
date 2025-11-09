package iuh.fit.se.services;

import iuh.fit.se.entities.Employees;

import java.util.List;
import java.util.Optional;

public interface EmployeeServieces {
    List<Employees> findAll();
    Optional<Employees> findById(int id);
    Employees save(Employees employee);
    void deleteById(int id);
}
