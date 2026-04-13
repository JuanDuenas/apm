package com.jp.apm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jp.apm.domain.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
