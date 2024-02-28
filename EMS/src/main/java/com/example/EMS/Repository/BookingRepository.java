package com.example.EMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EMS.model.Booking;
@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    // Custom queries, if needed
}
