package com.itv.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.itv.entity.Registration;
import com.itv.service.RegistrationService;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
@CrossOrigin(origins = "http://localhost:3000")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping
    public Registration register(@RequestParam Long userId, @RequestParam Long eventId) {
        return registrationService.registerUserForEvent(userId, eventId);
    }

    @GetMapping("/user/{userId}")
    public List<Registration> getUserRegistrations(@PathVariable Long userId) {
        return registrationService.getRegistrationsByUserId(userId);
    }
    
}

