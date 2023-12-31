package com.example.spa_case.model;

import com.example.spa_case.model.enums.EType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "customers")
@Entity
@Data
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String Phone;

    @Email
    private String email;

    @Enumerated
    private EType type;

    @OneToMany(mappedBy = "customer")
    private List<Bill> bills;
}