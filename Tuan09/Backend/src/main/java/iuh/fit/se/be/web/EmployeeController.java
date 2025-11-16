package iuh.fit.se.be.web;

import iuh.fit.se.be.entity.Employee;
import iuh.fit.se.be.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService service;
    public EmployeeController(EmployeeService service){ this.service = service; }

    @GetMapping
    public Page<Employee> list(@RequestParam(defaultValue="0") int page,
                               @RequestParam(defaultValue="10") int size){
        return service.findAll(PageRequest.of(page, size, Sort.by("id").descending()));
    }

    @GetMapping("/{id}")
    public Employee detail(@PathVariable Long id){ return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee create(@Valid @RequestBody Employee e){ return service.create(e); }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @Valid @RequestBody Employee e){
        return service.update(id, e);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){ service.delete(id); }
}

