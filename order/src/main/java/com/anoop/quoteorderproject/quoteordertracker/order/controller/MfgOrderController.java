package com.anoop.quoteorderproject.quoteordertracker.order.controller;

import org.springframework.web.bind.annotation.RestController;

import com.anoop.quoteorderproject.quoteordertracker.order.dto.MfgOrderDTO;
import com.anoop.quoteorderproject.quoteordertracker.order.service.MfgOrderService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/orders")

public class MfgOrderController {
    @Autowired
    private MfgOrderService mfgOrderService;

    @GetMapping("/{branches}/{startDate}/{endDate}")
    public ResponseEntity<List<MfgOrderDTO>> getOrders(@PathVariable String branches,
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {

        List<String> branchList = Arrays.asList(branches.split(","));
        List<MfgOrderDTO> orders = mfgOrderService.getOrdersByBranchesAndDateRange(branchList, startDate, endDate);
        return ResponseEntity.ok(orders);
    }

}
