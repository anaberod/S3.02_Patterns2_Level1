# 🍕 Pizza Builder Project

A simple Java application that demonstrates the **Builder Design Pattern** through a pizza ordering system. Users can create different types of pizzas with various sizes, doughs, and toppings using a flexible and extensible builder structure.

---

## 📄 Description

This project is part of a design patterns learning module (Level 1). The goal is to implement the **Builder Pattern** in Java to construct complex pizza objects step by step.

Each pizza has:
- A size (e.g., Medium, Large)
- A dough type (e.g., Classic, Thin)
- A list of toppings (e.g., Mozzarella, Pineapple)

---

## 🧠 How the Builder Pattern is applied in this project

This project applies the **Builder Design Pattern** by dividing the pizza creation process into distinct, manageable steps. Here's how the pattern is used:

- The **`Pizza`** class is the final product. It represents a complete pizza with a specific size, type of dough, and list of toppings.

- The **`PizzaBuilder` interface** defines the steps needed to build a pizza: setting the size, choosing the dough, and adding toppings.

- The classes **`HawaiianPizzaBuilder`** and **`FourCheesePizzaBuilder`** are fixed, concrete implementations of the builder. Each one follows a predefined recipe for a particular kind of pizza.

- The **`PizzaChef`** class acts as the *director*. It knows the correct sequence of steps to build a pizza, but doesn’t know the details of each pizza type. It simply receives a builder and constructs the pizza using the defined steps.

- Additionally, there’s a **`FlexiblePizzaBuilder`**, which provides a more modern, fluent interface. This builder allows the user to choose the pizza configuration step-by-step, customizing size, dough, and toppings in a flexible and dynamic way. It also includes validation to ensure that no incomplete pizzas are created.

This combination of structured and flexible builders allows the project to demonstrate both the traditional and modern uses of the Builder pattern in Java.

---

## 🔄 How it works (Class Diagram)

```
              +-----------------+
              |     Pizza       |
              +-----------------+
                       ^
                       |
       +------------------------------+
       |           PizzaBuilder       |<-- Interface
       +------------------------------+
         |                |
         |                |
+-------------------+ +------------------------+
| HawaiianPizzaBuilder | FourCheesePizzaBuilder |
+-------------------+ +------------------------+
                       |
                       |
        +---------------------------+
        |   FlexiblePizzaBuilder    |  <-- Fluent (Modern) Builder
        +---------------------------+

              +-------------+
              | PizzaChef   | <-- Director
              +-------------+
```

---

## 🌍 Repository

Find the source code and project files on GitHub:  
[https://github.com/anaberod/S3.02_Patterns2_Level1.git](https://github.com/anaberod/S3.02_Patterns2_Level1.git)

---

## 💻 Technologies Used

- Java 24
- Gradle
- IntelliJ IDEA (recommended)
- Object-Oriented Programming (OOP)
- Builder Design Pattern

---

## 📋 Requirements

Before running the project, make sure you have:

- Java JDK 17 or higher
- Gradle installed (or use IntelliJ's built-in Gradle support)
- Git (optional, for cloning)

---

## 🛠️ Installation

```bash
git clone https://github.com/anaberod/S3.02_Patterns2_Level1.git
```

1. Open the project in **IntelliJ IDEA** or your preferred IDE
2. Import as a **Gradle project**
3. Wait for Gradle to sync and compile

---

## ▶️ Execution

To run the project:

1. Open the `Main.java` class
2. Right-click → **Run 'Main'**
3. Console output will show pizza objects built using different builders

Example output:

```
Hawaiian Pizza: Pizza{size='Medium', dough='Classic', toppings=[Pineapple, Ham, Mozzarella]}
Four Cheese Pizza: Pizza{size='Large', dough='Thin', toppings=[Mozzarella, Cheddar, Parmesan, Gorgonzola]}
Custom Pizza: Pizza{size='Small', dough='Whole Wheat', toppings=[Spinach, Feta, Tomato]}
```

---

## 💡 Key Features

- Demonstrates the Builder Pattern both in classic and fluent forms
- Validations prevent building incomplete pizzas
- Clean architecture with separation of concerns (builders, product, director)
- Easily extendable to support new pizza types

---

## 🤝 Contributions

Contributions are welcome!

1. Fork the repo
2. Create a feature branch:
   ```bash
   git checkout -b feature/my-feature
   ```
3. Commit and push your changes:
   ```bash
   git commit -m "Add feature"
   git push origin feature/my-feature
   ```
4. Open a Pull Request

---

