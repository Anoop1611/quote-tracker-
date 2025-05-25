package com.anoop.quoteorderproject.quoteordertracker.order.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import com.anoop.quoteorderproject.quoteordertracker.order.entity.MfgOrder;
@Repository
public interface MfgOrderRepository extends JpaRepository<MfgOrder, String> {
    List<MfgOrder> findByBranchInAndOrderDateBetween(
        List<String> branch, 
        Date startDate, 
        Date endDate
    );
    
}
