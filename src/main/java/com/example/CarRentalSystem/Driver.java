package com.example.CarRentalSystem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Driver")
public class Driver {
    @Id @Column private int Driver_id;
    @Column  private String  driver_name;
    @Column private int  driver_age;

    public int getDriver_id() {
        return Driver_id;
    }

    public void setDriver_id(int driver_id) {
        Driver_id = driver_id;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public int getDriver_age() {
        return driver_age;
    }

    public void setDriver_age(int driver_age) {
        this.driver_age = driver_age;
    }

    public float getDriver_commision() {
        return driver_commision;
    }

    public void setDriver_commision(float driver_commision) {
        this.driver_commision = driver_commision;
    }

    @Column private float  driver_commision;
}
