package com.anoop.quoteorderproject.quoteordertracker.authorization.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())           // Disable CSRF
                .authorizeHttpRequests(requests -> requests    // Allow all requests
                        .anyRequest().permitAll())
                .httpBasic(basic -> basic.disable())      // Disable HTTP Basic
                .formLogin(login -> login.disable());     // Disable Form Login

        return http.build();
    }
}
