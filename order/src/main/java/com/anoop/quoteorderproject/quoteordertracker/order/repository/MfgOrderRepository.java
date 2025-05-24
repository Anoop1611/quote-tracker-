package com.anoop.quoteorderproject.quoteordertracker.order.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anoop.quoteorderproject.quoteordertracker.order.entity.MfgOrder;
@Repository
public interface MfgOrderRepository extends JpaRepository<MfgOrder, String> {
    
    
}
