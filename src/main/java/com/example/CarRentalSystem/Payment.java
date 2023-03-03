package com.example.CarRentalSystem;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name="Transactiondetails")
public class Payment {
    @Id  @Column private int payment_id;
    @Column private String payment_type;
    @Column private int payment_amount;

}
