package com.example.CarRentalSystem;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "rentalcar")

public class Car {
    //@Embedded To reuse same data member in other class.
    @Transient//Does not load member or generate column in database
    @Column (name ="k")
    private String k;
    @Id @Column (name ="car_id")
    private String regNo;
    @Column (name ="car_ownerid")
    private String ownerId;

    @Transient
    @Column (name ="y")
    private String trans;

    @Column (name ="car_model")
    private String carModel;

    @Column (name ="car_name")
    private String carName;
    @Column (name ="car_color")
    private String carColor;
    @Column (name ="car_status")
    private String carStatus;
    @Column (name ="car_price")
    private int carPrice;
    @Column (name ="car_pickup")
    private String pickUp;
    @Column (name ="car_destination")
    private String destination;

    @OneToMany @JoinColumn (name = "booking_id")
    private List<Booking>bookingList;

}
