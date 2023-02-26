package com.example.CarRentalSystem;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {

    @Id
    @Column
    private int booking_id;
    @Column  private String  booking_date;

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }

    public int getDriver_time() {
        return driver_time;
    }

    public void setDriver_time(int driver_time) {
        this.driver_time = driver_time;
    }

    public int getDriver_hour() {
        return driver_hour;
    }

    public void setDriver_hour(int driver_hour) {
        this.driver_hour = driver_hour;
    }

    @Column private int  driver_time;
    @Column private int  driver_hour;

}
