# 📚 Course Management System (Java)
**Midterm Exam 1 - Programming II**  
📍 *Universidad Tecnológica Nacional (UTN)*

## 📘 Project Overview
This project is a Java-based solution for managing courses in an educational platform. The goal was to implement a robust domain entity using **Object-Oriented Programming (OOP)** principles within a single class, ensuring data integrity through strict manual validation.

## ✨ Academic Constraints & Requirements
This assignment was completed under specific academic guidelines to demonstrate fundamental OOP mastery:
*   **Single Domain Class:** All logic is contained within the `Curso` entity.
*   **Manual Validation (No Exceptions):** Per project constraints, `try-catch` blocks and `Exception` throwing were strictly prohibited. All data integrity was managed through manual **Defensive Programming** logic.
*   **No Class Relations:** The focus was exclusively on class internal structure (attributes, methods, and encapsulation).

## 🚀 Key Features & Implementation

### 1. Encapsulation & Data Integrity
*   All attributes are `private`.
*   **Immutable ID:** The `id` is marked as `final` and cannot be modified after instantiation.
*   **Restricted Setters:** Accessors were only created where necessary; setters for `id` and `totalCursos` were excluded to prevent data corruption.

### 2. Constructors & Overloading
*   **Primary Constructor:** Receives all parameters for complete object creation.
*   **Secondary Constructor:** Receives only name and duration, assigning a **default price of 100**.
*   **Static Tracking:** Uses a `static` variable to keep track of the total number of `Curso` objects instantiated.

### 3. Overloaded Methods
The `actualizarPrecio` method is overloaded to provide flexibility:
*   **Version A:** Increases price by a percentage (`double`).
*   **Version B:** Increases price by a fixed amount (`int`).

### 4. Defensive Programming Logic
Since Exceptions were not used, the class validates the following before allowing object creation or modification:
*   **Name:** Must not be null or empty.
*   **Duration:** Must be greater than 0.
*   **Price:** Must not be negative.
*   **Updates:** Any price increase values must be non-negative.

---

## 📂 Project Structure
```text
/src
├── Curso.java   # Domain entity with OOP logic and validations
└── Main.java    # Testing class (instantiation, updates, and robustness tests)
```

---

## 🛠️ Technologies Used
* **Language:** Java
* **Paradigm:** Object-Oriented Programming (OOP)
* **Tooling:** NetBeans

---

## 👥 Student Information
* **Name:** Valentina Caro
* **Course:** Programming II (Java)
* **Institution:** UTN - Tecnicatura Universitaria en Programación a Distancia 