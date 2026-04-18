package com.jp.apm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.apm.domain.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
