
package com.example.EMS.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.EMS.model.Booking;
import com.example.EMS.service.Bookingservice;

import ch.qos.logback.core.model.Model;

import java.util.List;
import java.util.Optional;
@Controller

public class BookingController {

    @Autowired
    private Bookingservice service;
    @GetMapping("/")
    public String index1() {
        return "index";
    }
    @GetMapping("/index")
    public String index() {
        return "index1";
    }
    @GetMapping("/booking_event")
    public String bookingevent() {
    	
        return "booking";
    }
    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }
    @GetMapping("/about1")
    public String about() {
        return "about";
    }
    
    
   
    @GetMapping("/bookinglist")
    public ModelAndView bookingList() {
        List<Booking> bookingList = service.getAllBooking();
        return new ModelAndView("bookinglist", "bookList", bookingList);
    }




   @PostMapping("/save")
   public String addBooking(@ModelAttribute Booking b) {
	   service.save(b);
	  return "redirect:/booking_event"; 
   }
   @RequestMapping("/editBook/{id}")
   public ModelAndView editBook(@PathVariable("id") int id) {
       Optional<Booking> booking = service.getBookingById(id);
       ModelAndView modelAndView = new ModelAndView("editbooking"); // The view name here
       modelAndView.addObject("booking", booking.orElse(null));
       return modelAndView;
   }
   @PostMapping("/updateBooking")
   public String updateBooking(@ModelAttribute Booking updatedBooking) {
       service.updateBooking(updatedBooking);
       return "redirect:/bookinglist"; // Redirect to the booking list page after updating
   }

   @GetMapping("/deleteMyList/{id}")
   public String deleteMyList(@PathVariable("id") int id) {
       service.deleteById(id);
       return "redirect:/bookinglist"; // Redirect to the booking list page after deletion
   }

}
