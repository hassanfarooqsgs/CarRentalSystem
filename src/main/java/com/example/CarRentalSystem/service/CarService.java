package com.example.CarRentalSystem.service;

import com.example.CarRentalSystem.Car;
import com.example.CarRentalSystem.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService {
@Autowired
    CarRepository c;

}
