package com.jp.apm.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "role")
public class Role { 

    public Role() { }
    public Role(String name) { this.name = name; }

    // Define el ID 
    @Id 
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY) 
    private Long id; 
    @Column(unique = true, nullable = false)
    private String name; 
    
    public Long getId() { return id; } 
    
    public void setId(Long id) { this.id = id; } 
    
    public String getName() { return name; } 
    
    public void setName(String name) { this.name = name; } }