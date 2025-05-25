package com.anoop.quoteorderproject.quoteordertracker.order.service;

import org.springframework.stereotype.Service;

import com.anoop.quoteorderproject.quoteordertracker.order.dto.MfgOrderProductionDetailDTO;
import com.anoop.quoteorderproject.quoteordertracker.order.entity.MfgOrderProductionDetail;
import com.anoop.quoteorderproject.quoteordertracker.order.repository.MfgOrderProductionDetailRepository;

import jakarta.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class MfgOrderProductionDetailService {
    private final MfgOrderProductionDetailRepository mfgOrderProductionDetailRepository;

    public MfgOrderProductionDetailService(MfgOrderProductionDetailRepository mfgOrderProductionDetailRepository) {
        this.mfgOrderProductionDetailRepository = mfgOrderProductionDetailRepository;
    }

    public MfgOrderProductionDetailDTO getByProductionId(String productionId) {
        Optional<MfgOrderProductionDetail> result = mfgOrderProductionDetailRepository.findByProductionId(productionId);
        return result.map(this::convertToDTO)
                .orElseThrow(() -> new EntityNotFoundException("Production detail not found"));

    }

    private MfgOrderProductionDetailDTO convertToDTO(MfgOrderProductionDetail entity) {
        MfgOrderProductionDetailDTO dto = new MfgOrderProductionDetailDTO();
        dto.setProductionId(entity.getProductionId());
        dto.setOperSeqId(entity.getOperSeqId());
        dto.setTaskType(entity.getTaskType());
        dto.setTaskDesc(entity.getTaskDesc());
        dto.setProductionQty(entity.getProductionQty());
        dto.setFinishedQty(entity.getFinishedQty());
        dto.setScheduledStartDate(entity.getScheduledStartDate());
        dto.setScheduledEndDate(entity.getScheduledEndDate());
        return dto;
    }
}
