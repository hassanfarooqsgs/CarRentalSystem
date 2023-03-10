package com.example.CarRentalSystem;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Entity
@Table(name="booking")
@Component
public class Booking {

    @ManyToOne @JoinColumn (name = "car_id")
    private Car carId;
    @OneToOne @JoinColumn(name = "payment_id")
    private Payment paymentid;
    @ManyToOne @JoinColumn(name = "user_id")
    private User userid;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name ="booking_id")
    private Integer bookingId;

    @Column  (name ="booking_date")
    private String  bookingDate;
    @Column (name ="booking_hour")
    private int  driverHour;

    @Column (name ="isdriver_require")
    private boolean isDriverRequired;


    }



