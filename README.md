# OOP_Design_Challenge

  # Project Overview

  This project demonstrates key Object-Oriented Programming (OOP) principles using a Media Library system. The system categorizes different types of media (Print and Digital) and implements inheritance, polymorphism, interfaces, and coupling through a structured class hierarchy.
  
# OOP Concepts Demonstrated

  1. **Inheritance:** 
     - `Print`, `Digital` and `Other` classes inherit from `Media`, following the "is-a" relationship.
  2. **Interfaces (if implemented in a subclass):** 
 *   - `Digital` implements an interface `Downloadable` to define its `download()` method.
  3. **Encapsulation:**
     - `title` and `author` are private fields, with public getter methods for controlled access.
  4. **Polymorphism:** 
     - `SocialMediaPost` overrides the method post originally from the `Digital` Class. `Book` Overrides the method publish originally from the `Print` class
  5. **Coupling (Data and Stamp Coupling):** 
     - **Data Coupling:** `setFileSize()` in the `Digital` class takes a primitive double value.
     - **Stamp Coupling:** `convertPrintToDigital()` in the `MediaConverter` class takes a `Print` object.

