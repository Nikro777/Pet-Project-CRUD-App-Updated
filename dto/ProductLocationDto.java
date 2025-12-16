package com.example.Pet_Project_CRUD_App.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@NotNull
@NotBlank
public class ProductLocationDto {
    private Long id;
    private String productName;
    private String categoryName;
    private Integer warehousePlace;
}