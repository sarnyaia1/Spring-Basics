package com.linkedin.spring.learningspring.webservice;

import com.linkedin.spring.learningspring.business.ReservationService;
import com.linkedin.spring.learningspring.business.RoomReservation;
import com.linkedin.spring.learningspring.data.Guest;
import com.linkedin.spring.learningspring.data.Room;
import com.linkedin.spring.learningspring.util.DateUtils;
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
        Date date = this.dateUtils.createDateFromDateString(dateString);
        return this.reservationService.getRoomReservationsForDate(date);
    }

    @GetMapping(path = "/guests")
    public List<Guest> getGuests(){
        return this.reservationService.getHotelGuests();
    }

    @PostMapping(path = "/guests")
    @ResponseStatus(HttpStatus.CREATED)
    public void addGuest(@RequestBody Guest guest){
        this.reservationService.addGuest(guest);
    }

    @GetMapping(path = "/rooms")
    public List<Room> getRooms(){
        return this.reservationService.getHotelRooms();
    }

}
