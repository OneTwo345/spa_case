package com.example.spa_case.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

import lombok.*;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table (name = "bills")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String customerPhone;

    private String customerEmail;

    private Long customerQuantity;

    private LocalDateTime timeBook;

    private LocalDateTime appointmentTime;

    private BigDecimal price;

    @OneToMany(mappedBy = "bill")
    private List<BillService> billServices;

    @OneToMany(mappedBy = "bill")
    private List<BillCombo> billCombos;
    @ManyToOne
    private Customer customer;




}