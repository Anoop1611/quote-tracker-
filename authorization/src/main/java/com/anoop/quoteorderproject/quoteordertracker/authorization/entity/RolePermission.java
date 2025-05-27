
package com.anoop.quoteorderproject.quoteordertracker.authorization.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(RolePermissionId.class)
public class RolePermission {

    @Id
    @ManyToOne
    @JoinColumn(name = "roleId", nullable = false)
    private Role role;

    @Id
    @ManyToOne
    @JoinColumn(name = "permissionId", nullable = false)
    private Permission permission;
}