package com.jp.apm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.apm.domain.model.ProjectUsers;

public interface ProjectUserRepository extends JpaRepository<ProjectUsers, Long> {
    
}
