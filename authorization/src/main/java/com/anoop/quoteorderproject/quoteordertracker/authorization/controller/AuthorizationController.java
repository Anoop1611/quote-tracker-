package com.anoop.quoteorderproject.quoteordertracker.authorization.controller;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.EmployeeDTO;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.AuthorizationResponse;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.EmployeeService;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.strategy.AuthorizationStrategyResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/authorization")
@RequiredArgsConstructor
public class AuthorizationController {

    private final EmployeeService employeeService;
    private final AuthorizationStrategyResolver resolver;

    @GetMapping("/{employeeId}")
    public ResponseEntity<AuthorizationResponse> authorizeUser(@PathVariable String employeeId) {
        EmployeeDTO employee = employeeService.getEmployeeById(employeeId)
            .orElseThrow(() -> new RuntimeException("Employee not found"));
        AuthorizationResponse response = resolver.resolve(employee);
        return ResponseEntity.ok(response);
    }
}
