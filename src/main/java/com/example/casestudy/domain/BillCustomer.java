package com.example.casestudy.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "bill_customers")
@Data
@NoArgsConstructor
public class BillCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private BigDecimal price;

    private Integer productQuantity;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Bill bill;
}
