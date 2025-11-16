package iuh.fit.se.fe.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeeDto {
    private Long id;

    @NotBlank
    @Size(max = 50)
    private String firstName;

    @NotBlank @Size(max = 50)
    private String lastName;

    @Email
    @NotBlank @Size(max = 120)
    private String email;

    @DecimalMin("0.0")
    private BigDecimal salary;

    @NotNull
    private LocalDate hireDate;

    // getters setters
}

