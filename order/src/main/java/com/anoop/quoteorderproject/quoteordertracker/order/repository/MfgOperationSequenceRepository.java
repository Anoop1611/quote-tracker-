package com.anoop.quoteorderproject.quoteordertracker.order.repository;
import com.anoop.quoteorderproject.quoteordertracker.order.entity.MfgOperationSequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MfgOperationSequenceRepository extends JpaRepository<MfgOperationSequence, Integer> {
   
}
