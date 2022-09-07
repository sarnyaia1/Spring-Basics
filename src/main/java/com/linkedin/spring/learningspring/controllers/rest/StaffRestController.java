package com.linkedin.spring.learningspring.controllers.rest;

import com.linkedin.spring.learningspring.data.StaffMember;
import com.linkedin.spring.learningspring.service.StaffService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
@AllArgsConstructor
public class StaffRestController {

    private final StaffService staffService;

    @GetMapping
    public List<StaffMember> getAllStaff(){
        return staffService.getAllStaff();
    }
}
