package com.example.CarRentalSystem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user")


public class User {
   @Id @Column int user_id;
    @Column String user_name;
    @Column String user_email;
    @Column int user_phn;
    @Column String user_address;
}
