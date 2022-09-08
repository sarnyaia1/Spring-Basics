package com.linkedin.spring.learningspring.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffMember {

    private String id;
    private String firstName;
    private String lastName;
    private Position position;

}
