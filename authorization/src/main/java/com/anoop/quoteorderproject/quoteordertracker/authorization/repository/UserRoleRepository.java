package com.anoop.quoteorderproject.quoteordertracker.authorization.repository;

import com.anoop.quoteorderproject.quoteordertracker.authorization.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

import org.springframework.stereotype.Repository;
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
    Optional<UserRole> findByAdUserIdIgnoreCase(String adUserId);
}
