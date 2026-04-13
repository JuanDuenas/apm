package com.jp.apm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jp.apm.domain.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
