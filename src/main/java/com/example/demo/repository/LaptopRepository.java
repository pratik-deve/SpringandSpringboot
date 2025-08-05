package com.example.demo.repository;

import com.example.demo.model.Laptop;
import org.springframework.stereotype.Repository;


@Repository
public class LaptopRepository {

    public void save(Laptop lap){
        System.out.println("Laptop is being saved ...");
    }
}
