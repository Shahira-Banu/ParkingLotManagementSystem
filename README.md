# ParkingLotApp

A simple Java console application to manage a parking lot database. This project demonstrates connecting to a database, retrieving vehicle and parking slot information, and displaying payment details for each vehicle.

---


## Project Overview
`ParkingLotApp` connects to a database containing tables for vehicles, parking slots, and payments. The application retrieves and displays the following information:

- Vehicle ID
- Vehicle number
- Owner name
- Vehicle type
- Assigned parking slot (if any)
- Payment amount

The project is designed for educational purposes and demonstrates JDBC connectivity, SQL queries with `JOIN`s, and basic console output formatting.

---

## Features
- Connects to a MySQL database using JDBC.
- Retrieves parking lot details using SQL `LEFT JOIN` queries.
- Handles cases where vehicles may not have an assigned parking slot or payment.
- Displays data in a clean, formatted manner in the console.

---

## Technologies Used
- Java SE 8+
- JDBC (Java Database Connectivity)
- MySQL (or any relational database)
- Eclipse or any Java IDE (optional)

---

## Database Schema
The project expects three tables:

### Vehicles Table (`vehicles`)
| Column Name     | Type         | Description                |
|-----------------|-------------|----------------------------|
| vehicle_id      | INT         | Primary Key                |
| vehicle_no      | VARCHAR     | Vehicle registration number|
| owner_name      | VARCHAR     | Owner of the vehicle       |
| vehicle_type    | VARCHAR     | Type of vehicle (Car, Bike)|
| parking_slot    | INT         | Foreign key referencing `slots(slot_id)` |

### Slots Table (`slots`)
| Column Name | Type | Description           |
|-------------|------|----------------------|
| slot_id     | INT  | Primary Key          |
| slot_number | VARCHAR | Slot identifier    |

### Payments Table (`payments`)
| Column Name | Type | Description           |
|-------------|------|----------------------|
| payment_id  | INT  | Primary Key          |
| vehicle_id  | INT  | Foreign key referencing `vehicles(vehicle_id)` |
| amount      | DOUBLE | Payment amount       |

---

## Setup Instructions

1. **Clone the repository**
```bash

