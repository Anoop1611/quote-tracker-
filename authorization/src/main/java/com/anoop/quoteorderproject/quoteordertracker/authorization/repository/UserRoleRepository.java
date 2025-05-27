package com.anoop.quoteorderproject.quoteordertracker.authorization.repository;

import com.anoop.quoteorderproject.quoteordertracker.authorization.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
    List<UserRole> findByAdUserIdIgnoreCase(String adUserId);
}
