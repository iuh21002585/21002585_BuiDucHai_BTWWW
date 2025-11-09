package dao;

import entyties.employees;

import java.util.List;

public interface employeesDao {
    void update(employees employees);

    List<employees> getAll();

    employees getById(int id);

    void deleteById(int id);

    void save(employees employees);
}
