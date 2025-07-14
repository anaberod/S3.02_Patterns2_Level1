# 🍕 Pizza Builder Project

A simple Java application that demonstrates the **Builder Design Pattern** through a pizza ordering system. Users can create different types of pizzas with various sizes, doughs, and toppings using a flexible and extensible builder structure.

## 📄 Description

This project is part of a design patterns learning module (Level 1). The goal is to implement the **Builder Pattern** in Java to construct complex pizza objects step by step.

- Each pizza has:
  - A size (e.g., Medium, Large)
  - A dough type (e.g., Classic, Thin)
  - A list of toppings (e.g., Mozzarella, Pineapple)

## 🌍 Repository

Find the source code and project files on GitHub:  
[https://github.com/anaberod/S3.02_Patterns2_Level1.git](https://github.com/anaberod/S3.02_Patterns2_Level1.git)

## 💻 Technologies Used

- Java 17+ (compatible with OpenJDK 23)
- Gradle
- IntelliJ IDEA (recommended)
- OOP principles
- Design Patterns (Builder Pattern)

## 📋 Requirements

Before running the project, make sure you have:

- Java JDK 17 or higher installed
- Gradle installed or use IntelliJ's built-in support
- Git (optional, for cloning)

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/anaberod/S3.02_Patterns2_Level1.git
   ```
2. Open the project with **IntelliJ IDEA** or your preferred IDE.
3. If using IntelliJ:
   - Open as a Gradle project
   - Let it import dependencies automatically

## ▶️ Execution

To run the project:

1. Locate the `Main.java` class.
2. Right-click and select **Run 'Main'**.
3. You will see output in the console showing the constructed pizzas.

Example output:
```
Pizza{size='Medium', dough='Classic', toppings=[Pineapple, Mozarella]}
Pizza{size='Large', dough='Thin', toppings=[Mozarella, Cheddar, Parmesan, Gorgonzola]}
```

## 🌐 Deployment

This is a local desktop Java application and does not require production deployment. You can package it using Gradle if needed:

```bash
./gradlew build
```

Or run it from command line:

```bash
./gradlew run
```

## 🤝 Contributions

Contributions are welcome!

If you'd like to contribute:

1. Fork the repository
2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes and push:
   ```bash
   git commit -m "Add your message here"
   git push origin feature/your-feature-name
   ```
4. Open a pull request

---

