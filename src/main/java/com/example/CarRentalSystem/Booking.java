package com.example.CarRentalSystem;


import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="booking")
public class Booking {

    @Id
    @Column(name ="booking_id")
    private Integer bookingId;
    @ManyToOne @JoinColumn (name = "car_id")
    private Car carId;
    @OneToOne @JoinColumn(name = "payment_id")
    private Payment paymentid;
    @ManyToOne @JoinColumn(name = "user_id")
    private User userid;

    @Column  (name ="booking_date")
    private String  bookingDate;
    @Column (name ="booking_hour")
    private int  driverHour;

    @Column (name ="isdriver_require")
    private boolean isDriverRequired;


    }



