package com.example.CarRentalSystem;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="user")
public class User {
    @OneToMany
    private List<Booking>bookingList;
   @Id @Column (name="user_id")
   private int userId;

    @Column (name="user_name")
    private String userName;
    @Column (name="user_email")
    private String userEmail;
    @Column (name="user_phn")
    private int userPhn;
    @Column (name="user_address")
    private String userAddress;
    @Column (name="user_type")
    private String userType;
}
