package com.linkedin.spring.learningspring.data;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
@Data
public class Employee {

    @Id
    @Column(name="EMPLOYEE_ID")
    private String employeeID;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="POSITION")
    @Enumerated(EnumType.STRING)
    private Position position;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
