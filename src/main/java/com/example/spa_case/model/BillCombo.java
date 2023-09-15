package com.example.spa_case.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "billCombo")
public class BillCombo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comboName;

    private BigDecimal price;

    private Long serviceCombo;

    @ManyToOne
    private Bill bill;
    @ManyToOne
    private Combo combo;
}
