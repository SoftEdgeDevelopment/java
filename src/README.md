
## Java Learning

---

[1.0: Primitive Types](#unit-1-primitive-types)

[1.1: Variables and Assignments](#variables-and-assignments)

[1.2: Input with Scanner](#input-with-scanner)

---

[2.0: Introduction to Objects](#introduction-to-objects)

[2.1: Methods and Classes](#methods-and-classes)

[2.2: Encapsulation, Inheritance, Polymorphism, Abstraction](#encapsulation-inheritance-polymorphism-abstraction)

---



## 1.0: Primitive Types <a name="unit-1-primitive-types"></a>

### Overview
In programming, data types define the nature of the data that can be stored and manipulated within a program. Primitive types are fundamental data types that are directly supported by the programming language. They are the building blocks of all other complex data types. In this unit, we'll explore various primitive types commonly used in programming and understand their characteristics and usage.

### List of Primitive Types
1. **byte**: A data type that represents an 8-bit signed integer. It can store values in the range of -128 to 127.
2. **short**: A data type that represents a 16-bit signed integer. It can store values in the range of -32,768 to 32,767.
3. **int**: A data type that represents a 32-bit signed integer. It can store values in the range of approximately -2.1 billion to 2.1 billion.
4. **long**: A data type that represents a 64-bit signed integer. It can store values in the range of approximately -9.2 quintillion to 9.2 quintillion.
5. **float**: A data type that represents single-precision floating-point numbers. It is useful for storing decimal numbers and occupies 32 bits in memory.
6. **double**: A data type that represents double-precision floating-point numbers. It provides higher precision than float and occupies 64 bits in memory.
7. **char**: A data type that represents a single Unicode character. It occupies 16 bits in memory.
8. **boolean**: A data type that represents a boolean value, which can be either true or false.

### Literal Values and Default Values
- **Literal Values**: Literal values are constant values that can be assigned directly to variables. For example, `int x = 5;` assigns the literal value `5` to the variable `x`.
- **Default Values**: Each primitive type has a default value if not explicitly initialized. For example, the default value for `int` is `0`, and for `boolean` is `false`.

### Type Promotion and Type Casting
- **Type Promotion**: When operations involve operands of different types, smaller types are automatically promoted to larger types to perform the operation. For example, if you add an `int` and a `double`, the `int` is promoted to a `double` before the addition.
- **Type Casting**: Type casting is the explicit conversion of a value from one data type to another. It can be done using casting operators. For example, `(int) 3.14` casts the `double` value `3.14` to an `int`.

## 1.1: Variables and Assignments <a name="variables-and-assignments"></a>

### Variable Naming Conventions
- Variables should have meaningful names that reflect their purpose and usage.
- Variable names should start with a letter or an underscore, followed by letters, digits, or underscores.
- CamelCase or snake_case are commonly used naming conventions, depending on the programming language's style guide.

### Initializing Variables with Literals and Expressions
- Variables can be initialized with literal values directly, such as `int x = 10;`.
- They can also be initialized with expressions, such as `int y = x + 5;`, where the value of `y` is calculated based on the value of `x`.

### Type Casting and Conversion Techniques
- Type casting is used when converting between different data types. For example, `double` can be cast to `int` using `(int)` before the double value.
- Conversion techniques include implicit conversion, where the compiler automatically converts compatible types, and explicit conversion, where the programmer specifies the conversion using casting.

## 1.2: Input with Scanner <a name="input-with-scanner"></a>

### Overview
In programming, often you need to interact with users by taking input from them. The `Scanner` class in Java provides various methods for taking user input from the keyboard. It allows you to read different types of data, such as integers, floating-point numbers, strings, etc. In this section, we'll explore how to use the `Scanner` class to read input from the user.

### Importing Scanner Class
Before using the `Scanner` class, you need to import it into your Java program. You can do this by adding the following import statement at the beginning of your code:

## Creating Scanner Object
Once you've imported the `Scanner` class, you need to create a `Scanner` object to start reading input. You can create a `Scanner` object by instantiating it with `System.in` as the argument, which represents the standard input stream (usually the keyboard).

## Reading Different Types of Input

### Reading Integers
You can use the `nextInt()` method of the `Scanner` class to read an integer from the user.

### Reading Floating-Point Numbers
Similarly, you can use the `nextDouble()` method to read a double value from the user.

### Reading Strings
To read a string from the user, you can use the `nextLine()` method.

## Closing the Scanner
After you're done reading input, it's good practice to close the `Scanner` object to release the resources it's using.

## Example
Here's a simple example demonstrating the usage of `Scanner` to read input from the user:

Here's how the program works:

1. It prompts the user to enter their name.
2. It reads the name using `scanner.nextLine()` and stores it in the `name` variable.
3. It prompts the user to enter their age.
4. It reads the age using `scanner.nextInt()` and stores it in the `age` variable.
5. It prints a personalized message to the user with their name and age.
6. It closes the `Scanner` object to release system resources.

This concludes the explanation of the program. Further instructions or explanations can be added here.


```java
// Importing the Scanner class from the java.util package
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the standard input stream (usually the keyboard)
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the user to enter their name
        System.out.print("Enter your name: ");
        // Reading the name input from the user and storing it in the 'name' variable
        String name = scanner.nextLine();
        
        // Prompting the user to enter their age
        System.out.print("Enter your age: ");
        // Reading the age input from the user and storing it in the 'age' variable
        int age = scanner.nextInt();
        
        // Displaying a personalized message to the user with their name and age
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        
        // Closing the Scanner object to release system resources
        scanner.close();
    }
}
```

---

# 2.0 Introduction to Objects <a name="introduction-to-objects"></a>

## Overview

Fundamental principles of object-oriented programming (OOP), a paradigm widely used in modern software development. OOP revolves around the concept of objects, which encapsulate both data (state) and functionality (behavior). Understanding these principles is crucial for building robust and maintainable software systems.

### Fundamental Principles of Object-Oriented Programming (OOP)

Object-oriented programming is centered around the following key principles:

1. **Encapsulation**: Objects encapsulate data (attributes or properties) and behavior (methods or functions) within a single unit. This promotes modularity and hides the internal workings of an object from the outside world, enabling better code organization and maintenance.

2. **Inheritance**: Inheritance allows a new class (subclass or derived class) to inherit attributes and methods from an existing class (superclass or base class). This promotes code reuse, extensibility, and hierarchical relationships between classes.

3. **Polymorphism**: Polymorphism enables objects of different classes to be treated as objects of a common superclass. This allows for more flexible and dynamic behavior at runtime, as methods can be overridden in subclasses to provide specialized implementations.

4. **Abstraction**: Abstraction focuses on representing the essential features of an object while hiding unnecessary details. It allows programmers to create models that capture the real-world entities and their interactions in a simplified manner.

## State and Behavior in Objects

Objects in OOP have two fundamental aspects:

1. **State**: The state of an object represents the values of its attributes at any given moment. These attributes define the object's characteristics or properties.

2. **Behavior**: The behavior of an object is defined by its methods, which encapsulate the actions or operations that the object can perform. Methods operate on the object's state and may modify it.

Understanding the state and behavior of objects is essential for designing effective and meaningful object-oriented systems.

# 2.1 Methods and Classes <a name="methods-and-classes"></a>

## Declaring and Invoking Methods

Methods are functions associated with objects that define their behavior. They are declared within classes and can be invoked to perform specific actions.

```java
public class Example {
    // Method declaration
    public void greet() {
        System.out.println("Hello, world!");
    }

    public static void main(String[] args) {
        // Creating an object of the Example class
        Example example = new Example();
        // Invoking the greet method
        example.greet();
    }
}
```
## Method Overloading and Constructors

Method overloading allows multiple methods with the same name but different parameter lists within a class. Constructors are special methods used for initializing objects when they are created. Understanding method overloading and constructors is crucial for building flexible and versatile classes.

```java
public class Calculator {
// Method overloading
public int add(int a, int b) {
return a + b;
}

    public double add(double a, double b) {
        return a + b;
    }

    // Constructor
    public Calculator() {
        // Constructor body
    }
}
```

## Creating and Using Classes with Attributes and Behaviors

Classes are blueprints for creating objects in OOP. They encapsulate both attributes (state) and behaviors (methods) that define the objects' characteristics and functionality. Properly designing classes with appropriate attributes and behaviors is essential for building well-structured and maintainable software systems.

```java
public class Person {
// Attributes
private String name;
private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
```

## 2.2 - Encapsulation, Inheritance, Polymorphism, Abstraction <a name="encapsulation-inheritance-polymorphism-abstraction"></a>

## Encapsulation

Objects encapsulate data (attributes or properties) and behavior (methods or functions) within a single unit. This promotes modularity and hides the internal workings of an object from the outside world, enabling better code organization and maintenance.

```java
public class Person {
    // Private attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

## Inheritance

Inheritance allows a new class (subclass or derived class) to inherit attributes and methods from an existing class (superclass or base class). This promotes code reuse, extensibility, and hierarchical relationships between classes.

```java
// Superclass
public class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("The " + species + " is eating.");
    }
}

// Subclass inheriting from Animal
public class Dog extends Animal {
    public Dog() {
        super("Dog"); // Call to superclass constructor
    }

    public void bark() {
        System.out.println("The dog is barking.");
    }
}
```

## Polymorphism

Polymorphism enables objects of different classes to be treated as objects of a common superclass. This allows for more flexible and dynamic behavior at runtime, as methods can be overridden in subclasses to provide specialized implementations.

```java
// Superclass
public class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Subclasses overriding the draw() method
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}
```

## Abstraction

Abstraction focuses on representing the essential features of an object while hiding unnecessary details. It allows programmers to create models that capture the real-world entities and their interactions in a simplified manner.

```java
// Abstract class
public abstract class Shape {
    // Abstract method
    public abstract void draw();
}

// Concrete subclasses implementing the draw() method
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}
```

---



