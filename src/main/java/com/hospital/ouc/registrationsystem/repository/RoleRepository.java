package com.hospital.ouc.registrationsystem.repository;

import java.util.Optional;

import com.hospital.ouc.registrationsystem.entity.ERole;
import com.hospital.ouc.registrationsystem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 提供角色数据的访问接口，用于查询角色。
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
