package com.anoop.quoteorderproject.quoteordertracker.authorization.repository;

import com.anoop.quoteorderproject.quoteordertracker.authorization.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import org.springframework.stereotype.Repository;
@Repository 
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}

