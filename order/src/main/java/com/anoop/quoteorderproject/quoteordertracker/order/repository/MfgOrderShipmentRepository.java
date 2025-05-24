package com.anoop.quoteorderproject.quoteordertracker.order.repository;

import org.springframework.stereotype.Repository;
import com.anoop.quoteorderproject.quoteordertracker.order.entity.MfgOrderShipment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
@Repository
public interface MfgOrderShipmentRepository extends JpaRepository<MfgOrderShipment, Long> {
    // Custom query methods can be defined here if needed
    // For example, to find shipments by productionId:
    List<MfgOrderShipment> findByProductionId(String productionId);
    
}
