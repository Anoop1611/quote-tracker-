package com.anoop.quoteorderproject.quoteordertracker.order.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anoop.quoteorderproject.quoteordertracker.order.dto.MfgOrderProductionDetailDTO;
import com.anoop.quoteorderproject.quoteordertracker.order.service.MfgOrderProductionDetailService;

@RestController
@RequestMapping("/api/production")
public class MfgOrderProductionDetailController {
    private final MfgOrderProductionDetailService productionDetailService;

    public MfgOrderProductionDetailController(MfgOrderProductionDetailService productionDetailService) {
        this.productionDetailService = productionDetailService;
    }

    @GetMapping("/{productionId}")
    public ResponseEntity<MfgOrderProductionDetailDTO> getProductionDetails(@PathVariable String productionId) {
        MfgOrderProductionDetailDTO dto = productionDetailService.getByProductionId(productionId);
        return ResponseEntity.ok(dto);
    }
}
