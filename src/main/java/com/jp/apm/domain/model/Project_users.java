package com.jp.apm.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "project_users")
public class Project_users {

    public Project_users() { }
    public Project_users(Project projectId, User userId, Role roleId) {
        this.project_Id = projectId;
        this.user_Id = userId;
    }
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private Project project_Id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user_Id;
    
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role_Id;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Project getProjectId() { return project_Id; }

    public void setProjectId(Project projectId) { this.project_Id = projectId; }

    public User getUserId() { return user_Id; }

    public void setUserId(User userId) { this.user_Id = userId; }

    public Role getRoleId() { return role_Id; }

    public void setRoleId(Role roleId) { this.role_Id = roleId; }
}