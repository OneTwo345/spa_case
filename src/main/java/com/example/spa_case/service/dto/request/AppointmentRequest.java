package com.example.spa_case.service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AppointmentRequest {
    private String name;
    private String email;
    private String phone;
    private String appointment;
    List<Service> serviceList;
    private String ok;

}
