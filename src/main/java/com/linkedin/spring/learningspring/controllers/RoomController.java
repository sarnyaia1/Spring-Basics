package com.linkedin.spring.learningspring.controllers;

import com.linkedin.spring.learningspring.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/rooms")
@AllArgsConstructor
public class RoomController {

    private final ReservationService reservationService;

    @RequestMapping(method = RequestMethod.GET)
    public String getRooms(Model model){
        model.addAttribute("rooms", reservationService.getHotelRooms());
        return "hotel-rooms";
    }
}
