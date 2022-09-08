package com.linkedin.spring.learningspring.controllers;

import com.linkedin.spring.learningspring.data.EmployeeRepository;
import com.linkedin.spring.learningspring.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {

    private final ReservationService reservationService;

    @RequestMapping(method = RequestMethod.GET)
    public String getEmployees(Model model){
        model.addAttribute("employees", reservationService.getHotelEmployees());
        return "hotel-employees";
    }
}
