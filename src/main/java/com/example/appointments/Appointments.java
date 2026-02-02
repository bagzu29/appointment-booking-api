package com.example.appointments;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Appointments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientName;
    private LocalDateTime appointmentTime;
    private boolean isBooked = false;

    // These allow other files to read/write the data
    public Long getId() { return id; }
    public String getPatientName() { return patientName; }
    public void setPatientName(String name) { this.patientName = name; }
    public boolean isBooked() { return isBooked; }
    public void setBooked(boolean booked) { isBooked = booked; }
}
