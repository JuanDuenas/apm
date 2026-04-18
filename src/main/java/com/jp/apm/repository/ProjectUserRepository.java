package com.jp.apm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.apm.domain.model.ProjectUser;

public interface ProjectUserRepository extends JpaRepository<ProjectUser, Long> {
    
}
