# Builder Pattern — Car Construction System

## Project Overview

This project demonstrates the **Builder Creational Design Pattern** using Java.

The project implements a simple **Car Construction System**, where different types of cars can be created step by step using the Builder Pattern.

The system supports two car configurations:

- Sports Car
- Family Car

## Technologies

- Java
- IntelliJ IDEA
- JDK 17 or higher

## Design Pattern

The project uses the **Builder Pattern**.

### Pattern Components

| Component | Class | Responsibility |
|---|---|---|
| Product | `Car` | Represents the final car object |
| Builder | `CarBuilder` | Defines car construction steps |
| Concrete Builder | `SportsCarBuilder` | Builds a sports car |
| Concrete Builder | `FamilyCarBuilder` | Builds a family car |
| Director | `CarDirector` | Defines predefined construction sequences |
| Client | `Main` | Uses the builders to create cars |

`CarValidator` is an additional utility class responsible for validating car parameters.

## Project Structure

```text
BuilderPatternAssignment
├── src
│   └── builder
│       ├── Car.java
│       ├── CarBuilder.java
│       ├── SportsCarBuilder.java
│       ├── FamilyCarBuilder.java
│       ├── CarDirector.java
│       ├── CarValidator.java
│       └── Main.java
│
└── README.md  
