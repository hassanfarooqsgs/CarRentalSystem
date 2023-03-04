package com.example.CarRentalSystem;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name="Transactiondetails")
public class Payment {
    @Id  @Column (name="payment_id")
    private int paymentId;

    @Column (name="payment_type")
    private String paymentType;
    @Column (name="total_amount")
    private int totalAmount;
    @Column (name = "advance_amount")
    private int advanceAmount;
    @Column (name="balance_amount")
    private int balanceAmount;

    @OneToOne @JoinColumn(name = "booding_id")
    private Booking bookingid;
}
