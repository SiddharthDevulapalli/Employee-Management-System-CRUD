package com.sid.empmgmtsys.service;

import com.sid.empmgmtsys.dto.EmployeeDto;
import com.sid.empmgmtsys.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    EmployeeDto deleteEmployee(Long employeeId);

}
