package com.example.appointments;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentRepository repository;

    public AppointmentController(AppointmentRepository repository) {
        this.repository = repository;
    }

    // This mimics your coworker's "Conflict Handling" feature
    @PostMapping("/{id}/reserve")
    public ResponseEntity<String> reserve(@PathVariable Long id) {
        return repository.findById(id)
                .map(appointment -> {
                    if (appointment.isBooked()) {
                        // This returns the HTTP 409 Conflict your coworker mentioned!
                        return ResponseEntity.status(409).body("Error: Already booked!");
                    }
                    appointment.setBooked(true);
                    repository.save(appointment);
                    return ResponseEntity.ok("Success: Appointment reserved!");
                })
                .orElse(ResponseEntity.notFound().build());
    }
}