package com.example.CarRentalSystem;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Booking")
public class Booking {

    @Id
    @Column
    private Integer booking_id;
    @Column  private String  booking_date;
    @Column private Integer  driver_time;
    @Column private int  driver_hour;



    }



