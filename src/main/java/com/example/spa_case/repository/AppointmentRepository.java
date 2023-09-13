package com.example.spa_case.repository;

import com.example.spa_case.model.Appointment;
import com.example.spa_case.model.BillProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

}
