package com.example.spa_case.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

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

    private Integer customerQuantity;

    private LocalDateTime appointment;

    @OneToMany(mappedBy = "bill")
    private List<BillProduct> billProducts;

    @ManyToOne
    private Customer customer;




}
