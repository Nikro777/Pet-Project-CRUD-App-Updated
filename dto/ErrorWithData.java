package com.example.Pet_Project_CRUD_App.dto;

import com.example.Pet_Project_CRUD_App.entity.Warehouse;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@NotNull
@NotBlank
public class ErrorWithData {
    private String errorMessage;
    private List<Warehouse> products;
}
