package com.example.spa_case.repository;

import com.example.spa_case.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,Long> {

}
