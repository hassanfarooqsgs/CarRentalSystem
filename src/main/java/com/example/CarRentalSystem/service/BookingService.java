package com.example.CarRentalSystem.service;

import com.example.CarRentalSystem.Booking;
import com.example.CarRentalSystem.Repository.BookingRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;



@Component
public class BookingService {
Booking booking;
BookingRepository bookingRepository;

    public boolean confirmBooking(String bookingHour, int bookingId, Date bookingDate) {
        if (isValidBooking(bookingHour, bookingId, bookingDate)) {
            bookingRepository.save(booking);
            return true;


        } else {
            return false;

        }


    }

    private boolean isValidBooking(String bookingHour, int bookingId, Date bookingDate) {
// Perform validation checks here
// Return true if valid, false otherwise
        if (isValidBooking(bookingHour, bookingId, bookingDate)) {
            return true;
        } else {
            return false;
        }
    }
    }

