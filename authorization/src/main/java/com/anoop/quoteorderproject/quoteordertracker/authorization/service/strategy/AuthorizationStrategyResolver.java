package com.anoop.quoteorderproject.quoteordertracker.authorization.service.strategy;
import  com.anoop.quoteorderproject.quoteordertracker.authorization.dto.AuthorizationResponse;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.EmployeeDTO;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class AuthorizationStrategyResolver {
    private final List<AuthorizationStrategy> strategies;

    public AuthorizationResponse resolve(EmployeeDTO employee) {
        return strategies.stream()
                .filter(strategy -> strategy.isApplicable(employee))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No applicable strategy found."))
                .authorize(employee);
    }
}
