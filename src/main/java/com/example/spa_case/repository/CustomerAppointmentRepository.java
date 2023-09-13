package com.example.spa_case.repository;

import com.example.spa_case.model.Appointment;
import com.example.spa_case.model.CustomerAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerAppointmentRepository extends JpaRepository<CustomerAppointment,Long> {

}
