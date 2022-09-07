package com.linkedin.spring.learningspring.controllers;

import com.linkedin.spring.learningspring.service.StaffService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
@AllArgsConstructor
public class StaffController {

    private final StaffService staffService;

    @GetMapping
    public String getAllStaff(Model model){
        model.addAttribute("staff", staffService.getAllStaff());
        return "staff";
    }
}
