package com.anoop.quoteorderproject.quoteordertracker.authorization.repository;
import com.anoop.quoteorderproject.quoteordertracker.authorization.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {
    // Custom query methods can be defined here if needed
    // For example, to find branches by name:
    List<Branch> findByName(String name);
    
    // You can also define methods for other fields as required

}
