package com.example.spa_case.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

import java.math.BigDecimal;

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

    @OneToMany(mappedBy = "service")
    private List<Image> images;

    @OneToMany(mappedBy = "service")
    private List<ComboService> comboServices;

    @OneToMany(mappedBy = "service")
    private List<BillService> billServices;

}
