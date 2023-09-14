package com.example.spa_case.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "bill_services")
@Data
@NoArgsConstructor
public class BillService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serviceName;

    private BigDecimal price;

    private Long serviceQuantity;


    @ManyToOne
    private Bill bill;
    @ManyToOne
    private Service service;

}
