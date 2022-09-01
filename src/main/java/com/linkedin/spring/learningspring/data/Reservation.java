package com.linkedin.spring.learningspring.data;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="RESERVATION")
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID")
    private long reservationId;
    @Column(name = "ROOM_ID")
    private long roomId;
    @Column(name = "GUEST_ID")
    private long guestId;
    @Column(name = "RES_DATE")
    private Date reservationDate;

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + reservationId +
                ", roomId=" + roomId +
                ", guestID=" + guestId +
                ", date='" + reservationDate + '\'' +
                '}';
    }
}
