package com.anoop.quoteorderproject.quoteordertracker.authorization.repository;
import com.anoop.quoteorderproject.quoteordertracker.authorization.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface BranchRepository extends JpaRepository<Branch, String> {
    Branch findByBranchCode(String branchCode);
    List<Branch> findByDistrictCode(String districtCode);

    List<Branch> findByRegionCode(String regionCode);

}
