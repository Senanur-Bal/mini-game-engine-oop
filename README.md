# Mini Game Engine OOP Project

## 📌 Project Overview
This project demonstrates the evolution of a simple game engine using Object-Oriented Programming principles and design patterns.

The project starts with a basic procedural design (Phase 0) and is improved using the Factory Method Pattern in Phase 1.

---

## 🧱 Phase 0 (Initial Design)
- Basic GameObject structure
- if-else based type handling
- No design patterns used
- Problems identified and documented in PROBLEMS.md

---

## 🚀 Phase 1 (Factory Method Pattern)

### Improvements:
- Removed if-else logic from Main class
- Introduced GameObjectFactory
- Applied Factory Method Pattern
- Improved maintainability and scalability

### Refactored Structure:
- GameObject (abstract class)
- Player
- Enemy
- Item
- GameObjectFactory
- Main

---

## 🎯 Design Pattern Used

### Factory Method Pattern
Used to centralize object creation logic and remove conditional instantiation from Main class.

Benefits:
- Cleaner architecture
- Easier to extend new object types
- Better separation of concerns

---

## 📂 Project Structure