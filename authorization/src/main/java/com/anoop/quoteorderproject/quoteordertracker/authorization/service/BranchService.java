package com.anoop.quoteorderproject.quoteordertracker.authorization.service;
import org.springframework.stereotype.Service;
import com.anoop.quoteorderproject.quoteordertracker.authorization.entity.Branch;
import java.util.List;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.BranchDTO;
import com.anoop.quoteorderproject.quoteordertracker.authorization.repository.BranchRepository;
import lombok.RequiredArgsConstructor;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BranchService {

    private final BranchRepository branchRepository;

 
    public BranchDTO getBranchByCode(String branchCode) {
    Branch branch = branchRepository.findByBranchCode(branchCode);
    return branch != null ? convertToDTO(branch) : null;
}


  
    public List<BranchDTO> getBranchesByDistrict(String districtCode) {
        return branchRepository.findByDistrictCode(districtCode).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }


    public List<BranchDTO> getBranchesByRegion(String regionCode) {
        return branchRepository.findByRegionCode(regionCode).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<BranchDTO> getAllBranches() {
        return branchRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
    private BranchDTO convertToDTO(Branch branch) {
        return new BranchDTO(
                branch.getBranchCode(),
                branch.getName(),
                branch.getTreeBranchType(),
                branch.getGeneralLedgerExpense(),
                branch.getDistrictCode(),
                branch.getRegionCode()
        );
    }
}
