package com.linkedin.spring.learningspring.service;

import com.linkedin.spring.learningspring.data.Position;
import com.linkedin.spring.learningspring.data.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private static final List<StaffMember> staff = new ArrayList<>();

    static{
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Adam", "Smith", Position.CONCIERGE));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Gregor", "Brook", Position.HOUSEKEEPING));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Eve", "Johnson", Position.SECURITY));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Monica", "Belicia", Position.FRONT_DESK));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "John", "Snow", Position.HOUSEKEEPING));
    }

    public List<StaffMember> getAllStaff(){
        return staff;
    }
}
