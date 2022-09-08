package com.linkedin.spring.learningspring.controllers.rest;

import com.linkedin.spring.learningspring.data.Employee;
import com.linkedin.spring.learningspring.service.ReservationService;
import com.linkedin.spring.learningspring.data.RoomReservation;
import com.linkedin.spring.learningspring.data.Guest;
import com.linkedin.spring.learningspring.data.Room;
import com.linkedin.spring.learningspring.dateUtil.DateUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class WebServiceController {

    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<RoomReservation> getReservations(@RequestParam(value = "date", required = false) String dateString){
        Date date = dateUtils.createDateFromDateString(dateString);
        return reservationService.getRoomReservationsForDate(date);
    }

    @GetMapping(path = "/guests")
    public List<Guest> getGuests(){
        return reservationService.getHotelGuests();
    }

    @PostMapping(path = "/guests")
    @ResponseStatus(HttpStatus.CREATED)
    public void addGuest(@RequestBody Guest guest){
        reservationService.addGuest(guest);
    }

    @GetMapping(path = "/rooms")
    public List<Room> getRooms(){
        return reservationService.getHotelRooms();
    }

    @GetMapping(path = "/employees")
    public List<Employee> getEmployees(){
        return reservationService.getHotelEmployees();
    }

}
