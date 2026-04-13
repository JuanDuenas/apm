package com.jp.apm.domain.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
    public Project() { }
    public Project(String name, Date created_at, Date updated_at, String description) { 
        this.name = name; 
        this.created_at = created_at; 
        this.updated_at = updated_at; 
        this.description = description; 
    }

    private Long id;
    private String name;
    private Date created_at;
    private Date updated_at;    
    private String description;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getCreated_at() { return created_at; }
    public void setCreated_at(Date created_at) { this.created_at = created_at; }

    public Date getUpdated_at() { return updated_at; }
    public void setUpdated_at(Date updated_at) { this.updated_at = updated_at; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
