package com.simplemovie.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.simplemovie.entity.Booking;
import com.simplemovie.service.BookingService;

@RestController    //it sets the controller and return JSON format; so return booking 
@RequestMapping("/api/bookings") //ithu API base path -POST,GET,DELETE(/api/booking/{id})
public class BookingController {

    @Autowired
    private BookingService bookingService; //dependency injection
//    Controller ku BookingService thevai – Spring kudukkum”

    @PostMapping
    public Booking bookTickets(@RequestBody Booking booking) {
        return bookingService.bookTickets(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();//DB work service pannum,Controller just return pannum
    }

    @DeleteMapping("/{bookingId}")
    public String cancelBooking(@PathVariable Long bookingId) {
        bookingService.cancelBooking(bookingId);//Controller:service ah call pannum
        return "Booking cancelled successfully";
    }
}