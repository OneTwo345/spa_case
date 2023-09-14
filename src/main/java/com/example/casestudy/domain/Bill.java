package com.example.casestudy.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Table(name = "bills")
@Entity
@Data
@NoArgsConstructor
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String customerPhone;

    private String customerEmail;

    private Integer customerQuantity;

    private LocalDateTime appointment;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "bill")
    private List<BillCustomer> billCustomers;



}