package com.linkedin.spring.learningspring.controllers;

import java.util.Date;
import java.util.List;

import com.linkedin.spring.learningspring.service.ReservationService;
import com.linkedin.spring.learningspring.data.RoomReservation;
import com.linkedin.spring.learningspring.dateUtil.DateUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reservations")
@AllArgsConstructor
public class RoomReservationController {

    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    @RequestMapping(method = RequestMethod.GET)
    public String getReservations(@RequestParam(value="date", required=false) String dateString, Model model){
        Date date = dateUtils.createDateFromDateString(dateString);
        List<RoomReservation> roomReservations = reservationService.getRoomReservationsForDate(date);
        model.addAttribute("roomReservations", roomReservations);
        return "roomres";
    }
}
