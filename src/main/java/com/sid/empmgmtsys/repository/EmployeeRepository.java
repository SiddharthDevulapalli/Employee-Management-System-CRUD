package com.sid.empmgmtsys.repository;

import com.sid.empmgmtsys.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
}
