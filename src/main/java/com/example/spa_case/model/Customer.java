package com.example.spa_case.model;

import com.example.spa_case.model.enums.EType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String phone;

    private String email;

    private EType type;

    @OneToMany(mappedBy = "customer")
    private List<Bill> bills;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;
}
