package com.example.EMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.EMS.Repository.BookingRepository;
import com.example.EMS.model.Booking;

import java.util.List;
import java.util.Optional;

@Service
public class Bookingservice {
    
    @Autowired
    private BookingRepository bRepo;

    public void save(Booking b) {
        bRepo.save(b);
    }

    public List<Booking> getAllBooking() {
        return bRepo.findAll();
    }

    public Optional<Booking> getBookingById(int id) {
        return bRepo.findById(id);
    }

    public void deleteById(int id) {
        bRepo.deleteById(id);
    }

    public void updateBooking(Booking updatedBooking) {
        // Fetch the existing booking by ID
        Optional<Booking> existingBookingOpt = bRepo.findById(updatedBooking.getId());

        if (existingBookingOpt.isPresent()) {
            Booking existingBooking = existingBookingOpt.get();

            // Update the fields with the new values
            existingBooking.setName(updatedBooking.getName());
            existingBooking.setContact(updatedBooking.getContact());
            existingBooking.setEmail(updatedBooking.getEmail());
            existingBooking.setAddress(updatedBooking.getAddress());
            existingBooking.setDate(updatedBooking.getDate());
            existingBooking.setEventType(updatedBooking.getEventType());
            existingBooking.setDecorationQuality(updatedBooking.getDecorationQuality());
            existingBooking.setCateringQuality(updatedBooking.getCateringQuality());
            existingBooking.setTotalBudget(updatedBooking.getTotalBudget());

            // Save the updated booking
            bRepo.save(existingBooking);
        }
    }
}
