# Warehouse Car Parts System

## CSCI-3326 Final Project

### Team Members
- Jesus Campos
- Zebastian Sanchez
- Gerardo Colon
- Jorge Americano

---

# Project Overview

The Warehouse Car Parts System is a Java application designed to help local car lots and junkyards organize and manage their inventory more efficiently.

The system stores and tracks car parts such as:
- Engines
- Tires
- Batteries

Each part includes:
- Part name
- Model
- Year
- Buyer information
- Pricing based on the year of the part

This application helps businesses avoid manually searching through inventory and provides a more organized way to track available car parts.

---

# Why We Chose This Project

Many small local car lots and junkyards still manage inventory manually. This process is time-consuming and inefficient when searching for specific parts.

Our project provides a simple inventory management system that improves:
- Organization
- Inventory tracking
- Part searching
- Price management

---

# Technologies Used

## Programming Language
- Java

## Tools & IDEs
- Visual Studio Code
- GitHub

---

# Object-Oriented Programming Concepts

This project demonstrates several core OOP principles:

## Classes & Objects
Used to create and manage different car part objects.

## Encapsulation
Buyer information is protected using private variables with getters and setters.

## Inheritance
Child classes inherit shared attributes and methods from the abstract superclass `CarParts`.

## Polymorphism
Different classes override the `updated_price()` method to calculate prices differently.

## Abstraction
The `CarParts` class acts as an abstract superclass for all car part types.
