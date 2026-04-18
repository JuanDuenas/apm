package com.jp.apm.service;

import org.springframework.stereotype.Service;

import com.jp.apm.repository.ProjectUserRepository;
import com.jp.apm.repository.RoleRepository;
import com.jp.apm.repository.UserRepository;

@Service
public class ProjectUserService {


    private final ProjectUserRepository projectUserRepository;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    // Inyección de dependencias a través del constructor
    public ProjectUserService(ProjectUserRepository projectUserRepository, UserRepository userRepository, RoleRepository roleRepository) {
        this.projectUserRepository = projectUserRepository;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }


    


}
