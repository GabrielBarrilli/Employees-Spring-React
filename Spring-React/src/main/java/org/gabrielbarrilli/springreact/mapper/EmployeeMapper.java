package org.gabrielbarrilli.springreact.mapper;

import org.gabrielbarrilli.springreact.dto.EmployeeDto;
import org.gabrielbarrilli.springreact.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto toDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee toEntity(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
