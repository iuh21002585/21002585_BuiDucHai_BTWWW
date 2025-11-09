package dao.impl;

import dao.employeesDao;
import entyties.employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
@Component
public class employeesDaoImpl implements employeesDao {
    JdbcTemplate jdbcTemplate;

    @Autowired
    public employeesDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void update(employees employees) {

    }

    @Override
    public List<employees> getAll() {
        String sql = "SELECT id, name, role FROM employee"; // Tốt hơn là chỉ rõ các cột thay vì dùng '*'

        // jdbcTemplate sẽ lặp qua từng hàng kết quả
        // và áp dụng quy tắc ánh xạ này để tạo đối tượng
        List<employees> list = jdbcTemplate.query(sql, (rs, rowNum) -> {
            employees emp = new employees();
            emp.setId(rs.getInt("id"));
            emp.setName(rs.getString("name"));
            emp.setRole(rs.getString("role"));
            return emp;
        });

        return list;
    }

    @Override
    public employees getById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void save(employees employee) {
        // Giả sử cột 'id' là tự động tăng (AUTO_INCREMENT), nên ta không cần chèn nó.
        String sql = "INSERT INTO employee (name, role) VALUES (?, ?)";

        // Dùng 'update', truyền các giá trị từ đối tượng employee vào câu lệnh.
        // Thứ tự các tham số phải khớp với thứ tự các dấu '?' trong SQL.
        jdbcTemplate.update(sql, employee.getName(), employee.getRole());
    }
}
