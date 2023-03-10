package com.example.CarRentalSystem;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Entity
@Table(name = "rentalcar")
@Component
public class Car {
    //@Embedded To reuse same data member in other class.
  //  @Transient//Does not load member or generate column in database
    @Transient
    @Column (name ="y")
    private String trans;
    @Id
    @Column (name ="car_id")
    private String carId;
    @Column (name ="car_ownerid")
    private String ownerId;

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

    @OneToMany
    private List<Booking>bookingList;

}
