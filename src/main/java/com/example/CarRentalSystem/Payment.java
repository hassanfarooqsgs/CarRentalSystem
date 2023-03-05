package com.example.CarRentalSystem;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table (name="Transactiondetails")
public class Payment {
    @OneToOne @JoinColumn(name = "booding_id")
    private Booking bookingid;
    @Id  @Column (name="payment_id")
    private int paymentId;
//Done
    @Column (name="payment_type")
    private String paymentType;
    @Column (name="total_amount")
    private int totalAmount;
    @Column (name = "advance_amount")
    private int advanceAmount;
    @Column (name="balance_amount")
    private int balanceAmount;

    @Column(name="payment_date")
    private Date paymentDate;


}
