package com.example.demo.service;

import com.example.demo.repository.LaptopRepository;
import com.example.demo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepository repo ;

    public void addLaptop(Laptop lap){
        repo.save(lap);
    }

    public boolean isGoodToUse(){
        return true;
    }
}
