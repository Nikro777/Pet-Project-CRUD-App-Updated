package com.example.Pet_Project_CRUD_App.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@NotNull
@NotBlank
@Positive
public class WarehouseResponseDto {

    private Long id;
    private String category;
    private String productName;
    private Double productPrice;
}