package com.example.CarRentalSystem.Model;

import com.example.CarRentalSystem.Car;
import lombok.Data;

@Data
public class CarModel {
    private String carId;
    private String carModel;
    private String carName;
    private String carColor;
    private String carStatus;
    private int carPrice;
    public Car convertToEntity(){
        Car car=new Car();
        car.setCarModel(this.carModel);
        car.setCarId(this.carId);
        car.setCarColor(this.carColor);
        car.setCarPrice(this.carPrice);
        car.setCarName(this.carName);
        car.setCarStatus(this.carStatus);

        return car;
    }

    public CarModel convertToModel(Car car){
        CarModel carModel=new CarModel();

        carModel.setCarColor(car.getCarColor());
        carModel.setCarName(car.getCarName());
        carModel.setCarStatus(car.getCarStatus());
        carModel.setCarPrice(car.getCarPrice());
        carModel.setCarId(car.getCarId());
        carModel.setCarModel(car.getCarModel());
        return carModel;
    }
}
