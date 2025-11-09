package iuh.fit.se.services.Impl;

import iuh.fit.se.entities.Employees;
import iuh.fit.se.reponsitories.EmployeeReponsitoties;

import iuh.fit.se.services.EmployeeServieces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Đánh dấu đây là một Spring component thuộc tầng Service
public class EmployeeServiceImpl implements EmployeeServieces {

    private final EmployeeReponsitoties employeeRepository;

    @Autowired // Tự động tiêm (inject) EmployeeRepository vào đây
    public EmployeeServiceImpl(EmployeeReponsitoties employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employees> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employees> findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employees save(Employees employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}