package com.linkedin.spring.learningspring.util;

import com.linkedin.spring.learningspring.business.ReservationService;
import com.linkedin.spring.learningspring.business.RoomReservation;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@AllArgsConstructor
public class AppStartupEvent2 implements ApplicationListener<ApplicationReadyEvent> {

    // If you need more than one CONSTRUCTOR you have to Autowire the AllArgsConstructor!!
    private final ReservationService reservationService;
    private final DateUtils dateUtils;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Date date = this.dateUtils.createDateFromDateString("2022-01-01");
        List<RoomReservation> reservations = this.reservationService.getRoomReservationsForDate(date);
        reservations.forEach(System.out::println);
    }
}
