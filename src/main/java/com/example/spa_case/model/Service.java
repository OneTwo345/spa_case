package com.example.spa_case.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
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
    //new Image set Poster
    // new List Image set images;

    @ManyToOne
    private Image poster;

    @OneToMany(mappedBy = "service")
    private List<Image> images;

    @OneToMany(mappedBy = "service")
    private List<ComboService> comboServices;

    @OneToMany(mappedBy = "service")
    private List<BillService> billServices;

}
