package com.anoop.quoteorderproject.quoteordertracker.order.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anoop.quoteorderproject.quoteordertracker.order.dto.MfgOrderDTO;
import com.anoop.quoteorderproject.quoteordertracker.order.entity.MfgOrder;
import com.anoop.quoteorderproject.quoteordertracker.order.repository.MfgOrderRepository;
import java.util.Date;
import java.util.List;

@Service
public class MfgOrderService {
    @Autowired
    private MfgOrderRepository mfgOrderRepository;

    public List<MfgOrderDTO> getOrdersByBranchesAndDateRange(List<String> branches, Date startDate, Date endDate) {
        List<MfgOrder> orders = mfgOrderRepository.findByBranchInAndOrderDateBetween(branches, startDate, endDate);
        return orders.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private MfgOrderDTO convertToDTO(MfgOrder order) {
        MfgOrderDTO dto = new MfgOrderDTO();
        dto.setProductionId(order.getProductionId());
        dto.setMfgPillar(order.getMfgPillar());
        dto.setBranch(order.getBranch());
        dto.setProductionStatus(order.getProductionStatus());
        dto.setBranchQuoteNo(order.getBranchQuoteNo());
        dto.setBranchContact(order.getBranchContact());
        dto.setOrderDate(order.getOrderDate());
        dto.setDueDate(order.getDueDate());
        dto.setMfgPartNo(order.getMfgPartNo());
        dto.setMfgPartDesc(order.getMfgPartDesc());
        dto.setOrderQty(order.getOrderQty());
        dto.setBranchCost(order.getBranchCost());
        dto.setMfgQuoter(order.getMfgQuoter());
        dto.setCustomerAccountNo(order.getCustomerAccountNo());
        dto.setCustomerName(order.getCustomerName());
        return dto;
    }

}
