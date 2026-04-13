package com.jp.apm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jp.apm.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
