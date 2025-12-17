package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LocationEntity;

public interface LocationRepo extends JpaRepository<LocationEntity,Long>{
    
} 
