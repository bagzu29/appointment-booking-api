# Appointment Booking API

A Spring Boot application designed for managing medical appointments with a conflict-prevention system.

## Features
- **Conflict handling (HTTP 409)**: Prevents double-booking the same time slot.
- **In-memory H2 database**: Lightweight data storage for demonstrations.
- **REST API Endpoints**: Easy-to-use interface for reservations.

## Reservation Flow
1. **Book an appointment**
   `POST /appointments/{id}/reserve`
    - Returns **200 OK** if the slot is successfully booked.
    - Returns **409 Conflict** if the slot is already taken.