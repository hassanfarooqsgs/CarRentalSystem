package com.example.CarRentalSystem.Controller;
import com.example.CarRentalSystem.Car;
import com.example.CarRentalSystem.Model.CarModel;
import com.example.CarRentalSystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class CarController {

    @Autowired
    CarService carService;
    @PostMapping("/car")
    private CarModel savedetails(@RequestBody CarModel carModel){
        return carService.save(carModel);

    }
}
