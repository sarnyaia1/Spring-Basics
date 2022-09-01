package com.linkedin.spring.learningspring.web;

import java.util.Date;
import java.util.List;

import com.linkedin.spring.learningspring.business.ReservationService;
import com.linkedin.spring.learningspring.business.RoomReservation;
import com.linkedin.spring.learningspring.util.DateUtils;
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
        Date date = this.dateUtils.createDateFromDateString(dateString);
        List<RoomReservation> roomReservations = this.reservationService.getRoomReservationsForDate(date);
        model.addAttribute("roomReservations", roomReservations);
        return "roomres";
    }
}
