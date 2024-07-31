package org.gabrielbarrilli.springreact.repository;

import org.gabrielbarrilli.springreact.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>   {
}
