# OOP_Design_Challenge

  # Media.java

  This abstract class serves as the base class for different types of media, such as Print, Digital, and Other.
  It demonstrates the key object-oriented programming (OOP) principles outlined in the assignment:
  
  1. **Inheritance:** 
     - `Print`, `Digital` and `Other` classes inherit from `Media`, following the "is-a" relationship.
  2. **Polymorphism:** 
     - The `displayInfo()` method is defined as an abstract method and is overridden in subclasses.
  3. **Encapsulation:**
     - `title` and `author` are private fields, with public getter methods for controlled access.
  4. **Interfaces (if implemented in a subclass):** 
 *    - 
  5. **Coupling (Data and Stamp Coupling):** 
     - Methods in subclasses will demonstrate coupling by passing primitive data and objects.
     - `Print`
  This class provides a template for all media types, enforcing a structure that subclasses must follow.