package iuh.fit.se.be.service.impl;

import iuh.fit.se.be.entity.Employee;
import iuh.fit.se.be.repo.EmployeeRepository;
import iuh.fit.se.be.service.EmployeeService;
import jakarta.transaction.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.*;

import java.time.LocalDate;
import java.util.NoSuchElementException;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repo;
    public EmployeeServiceImpl(EmployeeRepository repo){ this.repo = repo; }

    @Override
    public Page<Employee> findAll(Pageable pageable){ return repo.findAll(pageable); }

    @Override
    public Employee findById(Long id){
        return repo.findById(id).orElseThrow(() -> new NoSuchElementException("Employee not found"));
    }

    @Override
    public Employee create(Employee e){
        if(repo.existsByEmail(e.getEmail())) throw new IllegalArgumentException("Email already exists");
        if(e.getHireDate()==null) e.setHireDate(LocalDate.now());
        return repo.save(e);
    }

    @Override
    public Employee update(Long id, Employee e){
        Employee current = findById(id);
        current.setFirstName(e.getFirstName());
        current.setLastName(e.getLastName());
        current.setEmail(e.getEmail());
        current.setSalary(e.getSalary());
        current.setHireDate(e.getHireDate());
        return repo.save(current);
    }

    @Override
    public void delete(Long id){ repo.deleteById(id); }
}

