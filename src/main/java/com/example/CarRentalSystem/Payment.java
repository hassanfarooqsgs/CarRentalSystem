package com.example.CarRentalSystem;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Transactiondetails")
public class Payment {
    @Id  @Column private int trans_id;

}
