package com.example.spa_case.dto.request;

import com.example.spa_case.model.Service;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerAppointmentRequest {
    private String name;
    private String email;
    private String phone;
    private String appointment;
    List<Service> productList;
    private String ok;

}
