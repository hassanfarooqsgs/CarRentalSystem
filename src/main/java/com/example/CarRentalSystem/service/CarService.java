package com.example.CarRentalSystem.service;

import com.example.CarRentalSystem.Booking;
import com.example.CarRentalSystem.Car;
import com.example.CarRentalSystem.Model.CarModel;
import com.example.CarRentalSystem.Repository.BookingRepository;
import com.example.CarRentalSystem.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CarService {
@Autowired
    CarRepository carRepository;
    public CarModel save(CarModel carModel){
        return carModel.convertToModel(carRepository.save(carModel.convertToEntity()));

    }



}



