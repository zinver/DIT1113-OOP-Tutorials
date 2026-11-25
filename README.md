# DIT1113 Object-Oriented Programming in Java — Assignment 1: OOP Tutorial Portfolio

A single repository consolidating all practical lab tutorials (Week 1–10) completed for the Object-Oriented Programming course, demonstrating my progress in Java, Git version control, and project documentation.

---

## 👤 Student Information

| | |
|---|---|
| **Name** | Ahmed Fardin |
| **Student ID** | 202502010015 |
| **Class Code** |  DIT1113 |
| **Program** | Diploma in Information Technology |
| **GitHub** | [zinver](https://github.com/zinver) |

## 📘 Course Information

| | |
|---|---|
| **Course** | Object-Oriented Programming (Java) |
| **Course Code** | DIT1113 / BIT1123 / BISE2093 |
| **Lecturer** | Sir Nazmirul Izzad bin Nassir |
| **Faculty** | Faculty of Information Technology |
| **Institution** | City University Malaysia, Cyberjaya Campus |

## 📝 Brief Course Description

This course introduces the fundamental concepts of Object-Oriented Programming (OOP) using Java. Students learn to design and build Java applications using the core OOP principles — classes and objects, encapsulation, inheritance, polymorphism, and abstraction — and apply them with essential Java libraries for collections, file handling, and graphical user interfaces (GUIs). The course also introduces industry practices such as version control with Git and GitHub.

---

## 📂 Repository Structure

```text
DIT1113-OOP-Tutorials/
├── README.md
├── myreport.pdf
│
├── tutorial_1/                  # Week 1 + Week 2
│   ├── week_1/
│   │   ├── HelloWorld.java
│   │   └── StudentGrade.java
│   └── week_2/
│       ├── Main.java
│       └── Student.java
│
├── tutorial_2/                  # Week 3-4
│   ├── Main.java
│   ├── Person.java
│   ├── Student.java
│   └── Lecturer.java
│
├── tutorial_3/                  # Week 5
│   ├── Main.java
│   ├── Student.java
│   └── documentation.txt
│
├── tutorial_4/                  # Week 6
│   ├── Main.java
│   ├── Employee.java
│   └── Lecturer.java
│
├── tutorial_5/                  # Week 7
│   ├── Main.java
│   └── Appliances.java
│
├── tutorial_6/                  # Week 8-9
│   ├── Main.java
│   └── task.txt
│
└── tutorial_7/                  # Week 10
    ├── Questions.java
    └── QuizBattleGUI.java
```

---

## 📚 Tutorial Summary (Week 1–10)

| Tutorial | Week | Topic | What I Built |
|---|---|---|---|
| **Tutorial 1** | Week 1 | Getting Started with GitHub & Codespaces | Set up the repository and Codespaces; wrote `HelloWorld` and a `StudentGrade` program using if-else to assign a grade. |
| | Week 2 | Classes & Objects | Created a `Student` class with attributes (name, age, GPA), a constructor, and methods (`displayInfo`, `study`, `takeExam`). |
| **Tutorial 2** | Week 3–4 | Inheritance & Method Overriding | Built a `Person` superclass with `Student` and `Lecturer` subclasses that override `introduce()` to behave differently. |
| **Tutorial 3** | Week 5 | Encapsulation | Student Information System using `private` variables with getters and setters; added a `programme` field and answered theory questions in `documentation.txt`. |
| **Tutorial 4** | Week 6 | Inheritance with `protected` & `super` | `Employee` superclass and `Lecturer` subclass using `super()` to reuse the parent constructor; added a `department` variable. |
| **Tutorial 5** | Week 7 | Abstraction | Smart Home Appliance system with an `abstract` `Appliance` class and four subclasses (Washing Machine, Refrigerator, Air Conditioner, Television) each implementing `operate()`. |
| **Tutorial 6** | Week 8–9 | ArrayList & File I/O | To-do list app that stores tasks in an `ArrayList`, saves them to `task.txt` with `BufferedWriter`, and loads them back with `BufferedReader`. |
| **Tutorial 7** | Week 10 | GUI with Java Swing | *Programming Quiz Battle* — a Swing GUI (`JFrame`, `JLabel`, `JButton`, `ActionListener`) that checks the user's answer and displays the result. |

---

## 🛠️ Technologies Used

- **Java** (JDK 17 or later)
- **Java Swing** — GUI (Tutorial 7)
- **Java Collections** (`ArrayList`) and **Java I/O** (`BufferedReader`, `BufferedWriter`)
- **Git** — version control
- **GitHub** & **GitHub Codespaces** — hosting and cloud development environment
- **Visual Studio Code** — code editor

---

## ▶️ How to Run the Projects

**Requirements:** Java JDK 17+ installed (`java -version` to check).

1. Clone the repository:
   ```bash
   git clone https://github.com/zinver/DIT1113-OOP-Tutorials.git
   cd DIT1113-OOP-Tutorials
   ```

2. Go into a tutorial folder, compile, and run:


---   ```bash
   cd tutorial_2
   javac *.java
   java Main
   ```

3. Commands for each tutorial:

   | Tutorial | Folder | Run |
   |---|---|---|
   | 1 (Week 1) | `tutorial_1/week_1` | `javac *.java` → `java HelloWorld` / `java StudentGrade` |
   | 1 (Week 2) | `tutorial_1/week_2` | `javac *.java` → `java Main` |
   | 2 – 6 | `tutorial_2` … `tutorial_6` | `javac *.java` → `java Main` |
   | 7 | `tutorial_7` | `javac *.java` → `java QuizBattleGUI` |


## 📄 Self-Reflective Report

The full self-reflective report is available here: [myreport.pdf](myreport.pdf)