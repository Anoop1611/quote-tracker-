package com.anoop.quoteorderproject.quoteordertracker.authorization.repository;

import com.anoop.quoteorderproject.quoteordertracker.authorization.entity.RolePermission;
import com.anoop.quoteorderproject.quoteordertracker.authorization.entity.RolePermissionId;
import com.anoop.quoteorderproject.quoteordertracker.authorization.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionRepository extends JpaRepository<RolePermission, RolePermissionId> {
    List<RolePermission> findByRole(Role role); // since you mapped Role entity, not just roleId
}
