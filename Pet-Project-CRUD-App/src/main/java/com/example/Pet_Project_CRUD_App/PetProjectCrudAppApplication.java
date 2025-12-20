package com.example.Pet_Project_CRUD_App;

import com.example.Pet_Project_CRUD_App.entity.*;
import com.example.Pet_Project_CRUD_App.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class PetProjectCrudAppApplication {

    private final CategoryRepository categoryRepository;
    private final WarehousePlaceRepository warehousePlaceRepository;
    private final ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(PetProjectCrudAppApplication.class, args);
    }
}