package com.linkedin.spring.learningspring.data;

import lombok.Data;

import java.util.Date;

@Data
public class RoomReservation {

    private long roomId;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private Date date;

    @Override
    public String toString() {
        return "RoomReservation{" +
                "roomId=" + roomId +
                ", guestId=" + guestId +
                ", roomName='" + roomName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", date=" + date +
                '}';
    }
}
