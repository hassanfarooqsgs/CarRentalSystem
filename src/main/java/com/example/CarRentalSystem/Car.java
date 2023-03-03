package com.example.CarRentalSystem;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "rentalcar")

public class Car {
    @Id @Column private String reg_no;
    @Column private String model;
    @Column  private String name;
    @Column private String colour;
    @Column private String status;
    @Column    private int price;
    @Column private String Driver_ID;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Column private String route;


}
