package com.example.Pet_Project_CRUD_App.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "warehouses_table", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private String productName;
    private Integer warehousePlace;
    private Double productPrice;
    private Integer quantity;
}
