package com.anoop.quoteorderproject.quoteordertracker.authorization.repository;
import com.anoop.quoteorderproject.quoteordertracker.authorization.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
    // Custom query methods can be defined here if needed
    // For example, to find employees by name:
    List<Employee> findByEmployeeName(String name);
    
    Optional<Employee> findByEmailIgnoreCase(String email);

    // You can also define methods for other fields as required
    
}
