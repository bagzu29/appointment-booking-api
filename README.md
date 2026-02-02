# 🏥 Appointment Booking System API

A robust **Spring Boot REST API** designed to handle medical appointment scheduling. This project demonstrates high-level concepts like **Resource Locking** and **Conflict Management** to ensure data integrity.

---

## 🚀 Key Features
* **Conflict Handling (HTTP 409)**: Built-in logic to prevent double-booking a single time slot.
* **In-Memory Data Persistence**: Uses **H2 Database** for zero-configuration setup—perfect for demonstrations.
* **Clean Architecture**: Separation of concerns between Models, Repositories, and Controllers.
* **Automatic Schema Generation**: Hibernate automatically manages database tables based on Java Entities.

---

## 🛠️ Technical Stack
| Technology | Usage |
| :--- | :--- |
| **Java 21+** | Core Programming Language |
| **Spring Boot 3.x** | Application Framework |
| **Spring Data JPA** | Database Communication |
| **H2 Database** | In-Memory Storage |
| **Maven** | Dependency & Build Management |

---

## 📖 API Usage Guide

### 1. Reserve an Appointment
To book a specific slot, send a `POST` request to the reservation endpoint.

**Endpoint:** `POST /appointments/{id}/reserve`

**Example Response (Success - 200 OK):**
```json
{
  "message": "Success: Appointment reserved!"
}