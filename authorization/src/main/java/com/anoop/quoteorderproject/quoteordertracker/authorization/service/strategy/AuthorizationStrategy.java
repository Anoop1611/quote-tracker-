package com.anoop.quoteorderproject.quoteordertracker.authorization.service.strategy;


import  com.anoop.quoteorderproject.quoteordertracker.authorization.dto.AuthorizationResponse;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.EmployeeDTO;

public interface AuthorizationStrategy {
    boolean isApplicable(EmployeeDTO employee);
    AuthorizationResponse authorize(EmployeeDTO employee);
}
