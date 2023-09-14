package com.example.spa_case.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "services")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal price;

    private String description;

    private File Image;


    @OneToMany(mappedBy = "service")
    private List<BillService> billServices;







}
