package com.anoop.quoteorderproject.quoteordertracker.order.repository;
import com.anoop.quoteorderproject.quoteordertracker.order.entity.MfgOrderProductionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MfgOrderProductionDetailRepository extends JpaRepository<MfgOrderProductionDetail, Long> {
    // Custom query methods can be defined here if needed
    // For example, to find production details by productionId:
    Optional<MfgOrderProductionDetail> findByProductionId(String productionId);
    
}
