# Abstract Class Car – Abstraction & Polymorphism in Java

This mini-project demonstrates abstraction and runtime polymorphism in Java using an abstract `Car` class and concrete subclasses like `Maruti`, `Innova`, and `Ferrari` that provide different implementations of common behaviors.[web:38][web:41]

## Concept overview

- **Abstraction**: The abstract `Car` class defines common operations such as `start()`, `stop()`, and abstract methods like `accelerate()`, `drive()`, and `combustion()` without fixing how each specific car behaves.[web:38][web:40]  
- **Polymorphism**: The `Road` class works with the abstract type `Car`, and at runtime it invokes the overridden methods of `Maruti`, `Innova`, or `Ferrari` based on the actual object passed in.[web:38][web:41][web:44]  

This design lets you extend the system with new car types without changing existing code that depends only on the `Car` abstraction.[web:38][web:41]

## Project structure

```text
Abstraction/
└── abstract_class_Car/
    ├── CarAbstractionDemo.java
    └── README.md
```

- `CarAbstractionDemo.java` contains all the classes for this example: `Car`, `Maruti`, `Innova`, `Ferrari`, `Road`, and `Main`.[web:39][web:43]  

## Classes and responsibilities

- `Car` (abstract)  
  - Declares the common API: `start()`, `stop()`, `accelerate()`, `drive()`, and `combustion()`.  
  - Cannot be instantiated directly and is meant to be subclassed by specific car types.[web:38][web:40]  

- `Maruti`, `Innova`, `Ferrari`  
  - Extend `Car` and implement the abstract methods to define their own acceleration, driving style, and engine type.  
  - Represent different real-world cars with different behavior while sharing the same interface.  

- `Road`  
  - Has a `permit(Car car)` method that accepts any `Car` object.  
  - Calls `start()`, `accelerate()`, `drive()`, `combustion()`, and `stop()` on the car, showing how one method can work with multiple concrete types.  

- `Main`  
  - Creates `Car` references pointing to `Maruti`, `Innova`, and `Ferrari` instances.  
  - Passes them to `Road.permit` and then downcasts to call subclass-specific methods, demonstrating both polymorphism and downcasting.  

## How polymorphism is used

```java
Car c1 = new Maruti();
Car c2 = new Innova();
Car c3 = new Ferrari();

Road r = new Road();
r.permit(c1);
r.permit(c2);
r.permit(c3);
```

- The variables are of type `Car`, but the actual objects are `Maruti`, `Innova`, and `Ferrari`.  
- When `permit` calls methods like `car.accelerate()` and `car.drive()`, the JVM dispatches to the correct overridden implementation based on the real object at runtime.[web:38][web:41][web:44]  

This is the classic “same interface, different behavior” idea that makes code more flexible and easier to extend.[web:41][web:44]

## How to run

1. Make sure you have Java (JDK 8 or later) installed and available on your PATH.[web:41]  
2. Open a terminal and navigate to this folder:

   ```bash
   cd Abstraction/abstract_class_Car
   ```

3. Compile the source file:

   ```bash
   javac CarAbstractionDemo.java
   ```

4. Run the program:

   ```bash
   java Main
   ```

You should see output where each car starts, accelerates, drives, combusts, and stops, followed by additional subclass-specific actions.

## Things to try

- Add a new subclass, for example `Tesla`, that extends `Car` and implements `accelerate()`, `drive()`, and `combustion()` (e.g., “electric engine”).  
- Pass a `Tesla` object to `Road.permit` and notice that you do not need to modify the `Road` class to support the new car type.[web:38][web:41]  
- Experiment with different speeds, gears, and engine types to see how polymorphism keeps your main logic the same while behaviors change.  

## What you learn from this example

- How to define and use abstract classes and abstract methods in Java.[web:38][web:40]  
- How inheritance and polymorphism help you write general, extensible code that works with an abstract type instead of concrete implementations.[web:38][web:41][web:44]  
- How to separate common behavior into a base class (`Car`) while letting subclasses customize the parts that change.  
