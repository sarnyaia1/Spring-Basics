package com.epam.spring.learningspring.web;

import com.epam.spring.learningspring.business.ReservationService;
import com.epam.spring.learningspring.business.RoomReservation;
import com.epam.spring.learningspring.data.Guest;
import com.epam.spring.learningspring.util.DateUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/guests")
@AllArgsConstructor
public class GuestController {

    private final ReservationService reservationService;

    @RequestMapping(method = RequestMethod.GET)
    public String getGuests(Model model){
        model.addAttribute("guests", this.reservationService.getHotelGuests());
        return "hotel-guests";
    }
}
