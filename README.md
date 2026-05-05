# Seçilen Konu: C (Mini Oyun Motoru)
**Gerekçe:** Başlangıç kodundaki if-else karmaşıklığını gidermek ve oyun nesnelerini daha modüler bir yapıda yönetmek için bu konuyu seçtim. Factory Method ile nesne üretimini, Structural desenler ile de nesne yeteneklerini modernize etmeyi hedefledim.

---

## 📌 Project Overview
This project demonstrates the evolution of a simple game engine using Object-Oriented Programming principles and design patterns. It traces the journey from a procedural approach to a highly flexible, pattern-oriented architecture.

---

## 🧱 Phase 0 (Initial Design)
- Basic GameObject structure.
- if-else based type handling for updates and creation.
- No design patterns used.
- Problems identified and documented in `PROBLEMS.md`.

---

## 🚀 Phase 1 (Creational Patterns)
### Improvements:
- Introduced **Factory Method Pattern** to centralize object creation.
- Removed conditional instantiation from the `Main` class.
- Improved scalability: Adding a new game object type no longer requires changing the client code.

---

## 🛠️ Phase 2 (Structural Patterns)
In this phase, two structural patterns were implemented to enhance the flexibility and integration capabilities of the engine.

### 1. Decorator Pattern
- **Problem:** Adding new abilities (like a Shield) to specific objects at runtime without creating a "class explosion" of subclasses.
- **Solution:** Implemented a `ShieldDecorator` that wraps any `GameObject` to add behavior dynamically.
- **Benefit:** Abilities can be stacked or removed at runtime without modifying the base classes.

### 2. Adapter Pattern
- **Problem:** Integrating an external, incompatible `LegacyLogger` class into our `GameObject` based update loop.
- **Solution:** Created a `LoggerAdapter` that translates our `update()` calls into the legacy system's specific methods.
- **Benefit:** Allows seamless integration of third-party or legacy libraries.

---

## 📂 Project Structure 
- `src/` : All Java source files (Core, Factory, Decorators, Adapters).
- `docs/ai-log/` : Step-by-step logs of AI collaboration for each phase.
- `PROBLEMS.md` : Analysis of architectural issues faced.
- `PATTERNS.md` : Technical details of the design patterns applied.
- `README.md` : Project documentation and selection justification.

---

## 🎯 How to Run
1. Place all `.java` files in the same directory.
2. Compile: `javac *.java`
3. Run: `java Main`