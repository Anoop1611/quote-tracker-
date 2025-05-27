package com.anoop.quoteorderproject.quoteordertracker.authorization.service;

import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.EmployeeDTO;
import com.anoop.quoteorderproject.quoteordertracker.authorization.entity.Employee;
import com.anoop.quoteorderproject.quoteordertracker.authorization.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

 
   public Optional<EmployeeDTO> getEmployeeById(String employeeId) {
    return employeeRepository.findById(employeeId)
            .map(this::convertToDTO);
}


    private EmployeeDTO convertToDTO(Employee employee) {
        return new EmployeeDTO(
                employee.getEmployeeId(),
                employee.getEmployeeName(),
                employee.getEmployeeEmail(),
                employee.getJobCode(),
                employee.getGeneralLedgerExpense(),
                employee.getTreeBranchType()
        );
    }
}
