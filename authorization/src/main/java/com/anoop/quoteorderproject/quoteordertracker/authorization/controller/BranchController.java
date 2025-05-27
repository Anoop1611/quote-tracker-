package com.anoop.quoteorderproject.quoteordertracker.authorization.controller;
import com.anoop.quoteorderproject.quoteordertracker.authorization.entity.Branch;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.BranchDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/api/branches")
@RequiredArgsConstructor
public class BranchController {

    private final BranchService branchService;

    @GetMapping("/{branchCode}")
    public ResponseEntity<BranchDTO> getBranchByCode(@PathVariable String branchCode) {
        BranchDTO branch = branchService.getBranchByCode(branchCode);
        return ResponseEntity.ok(branch);
    }

    @GetMapping("/district/{districtCode}")
    public ResponseEntity<List<BranchDTO>> getBranchesByDistrict(@PathVariable String districtCode) {
        List<BranchDTO> branches = branchService.getBranchesByDistrict(districtCode);
        return ResponseEntity.ok(branches);
    }

    @GetMapping("/region/{regionCode}")
    public ResponseEntity<List<BranchDTO>> getBranchesByRegion(@PathVariable String regionCode) {
        List<BranchDTO> branches = branchService.getBranchesByRegion(regionCode);
        return ResponseEntity.ok(branches);
    }

    @GetMapping
    public ResponseEntity<List<BranchDTO>> getAllBranches() {
        List<BranchDTO> branches = branchService.getAllBranches();
        return ResponseEntity.ok(branches);
    }
}
