# Smart Parking Management System 🚗

![Java](https://img.shields.io/badge/Language-Java-blue)
![OOP](https://img.shields.io/badge/Concept-OOP-orange)
![Console App](https://img.shields.io/badge/Application-Console--Based-green)

A console-based Smart Parking Management System developed using Core Java and Object-Oriented Programming principles.

The system simulates a real-world parking lot where users can park vehicles, remove them, track parking duration, calculate fees, and monitor parking revenue.

## ✨ Features

* Park vehicles in the nearest available slot
* Remove vehicles and calculate parking fees automatically
* Vehicle search using vehicle number
* Display detailed parking slot status
* Vehicle type pricing (Car / Bike)
* Total revenue tracking
* Formatted entry timestamps (Indian Standard Time)
* Menu-driven console interface

## 🛠 Tech Stack

* Java
* Object-Oriented Programming
* ArrayList (Java Collections)
* Java Time API
* Scanner (User Input Handling)

## 📂 Project Structure

```
SmartParkingSystem
│
├── Main.java
├── Vehicle.java
├── ParkingSlot.java
├── ParkingLot.java
└── VehicleType.java
```

## ⚙️ How It Works

1. The user enters the total number of parking slots.
2. Vehicles can be parked by entering vehicle number and type.
3. The system automatically assigns the first available slot.
4. When a vehicle leaves:

   * Parking duration is calculated
   * Parking fee is generated
5. Users can search for parked vehicles.
6. The system maintains total parking revenue.

## 🧠 System Design

This project follows Object-Oriented Design:

````

Vehicle
   │
   │ parked in
   ▼
ParkingSlot
   │
   │ managed by
   ▼
ParkingLot
   │
   │ controlled by
   ▼
Main (Menu System)

``` id="19h2f6"

## 📸 Example Output

Example interaction with the system:

````

Vehicle parked in slot: 1
Entry Time: 2026-03-11 19:45:10 IST

Slot 1 | Car | KA01AB1234 | Parked at: 2026-03-11 19:45:10 IST
Slot 2 | Empty
Slot 3 | Bike | KA09XY8899 | Parked at: 2026-03-11 19:46:02 IST

```id="bnut1k"

## 🚀 Future Improvements

- Add **GUI interface using JavaFX**
- Store parking data using **MySQL database**
- Build **REST API backend with Spring Boot**
- Integrate **IoT-based parking sensors**






