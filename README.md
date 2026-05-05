🎮 Mini Game Engine - OOP Evolution
# 🎮 Mini Game Engine - OOP Evolution

## 📌 Seçilen Konu: C# (Mini Oyun Motoru)
**Gerekçe:** Başlangıç kodundaki `if-else` karmaşıklığını gidermek ve oyun nesnelerini daha modüler bir yapıda yönetmek için bu konuyu seçtim. Factory Method ile nesne üretimini, Structural desenler ile de nesne yeteneklerini modernize etmeyi hedefledim.

---

## 🚀 Project Overview
This project demonstrates the evolution of a simple game engine using Object-Oriented Programming principles and design patterns. It traces the journey from a procedural approach (Phase 0) to a highly flexible, pattern-oriented architecture.

---

## 🧱 Phase 0 (Initial Design)
*   **Structure:** Basic `GameObject` structure.
*   **Logic:** `if-else` based type handling for updates and creation.
*   **Status:** No design patterns used.
*   **Documentation:** Problems identified and documented in [PROBLEMS.md](./PROBLEMS.md).

---

## 🚀 Phase 1 (Factory Method Pattern)

### Improvements:
*   **Refactoring:** Removed `if-else` logic from the `Main` class.
*   **Centralization:** Introduced `GameObjectFactory` to handle object instantiation.
*   **Pattern:** Applied **Factory Method Pattern** to improve maintainability and scalability.

### Refactored Structure:
*   **GameObject** (Abstract Class)
*   **Concrete Classes:** `Player`, `Enemy`, `Item`
*   **Factory:** `GameObjectFactory`
*   **Client:** `Main`

### 🎯 Design Pattern Benefits:
*   **Cleaner Architecture:** `Main` class focuses only on the game loop.
*   **Open/Closed Principle:** New object types can be added without modifying existing client code.

---

## 📂 Dokümantasyon ve Süreç Rehberi
Proje değerlendirmesi için aşağıdaki dosyalar incelenebilir:

*   **[Mimari Analiz (PATTERNS.md)](./PATTERNS.md):** Uygulanan Factory Method örüntüsünün detayları ve **Önce/Sonra UML Sınıf Diyagramları**.
*   **[Yapay Zeka Kullanım Logu (docs/ai-log/phase1.md)](./docs/ai-log/phase1.md):** AI ile yapılan review süreci ve alınan mimari kararların dökümü.

### 🛠 GitHub İş Akışı
*   `PROBLEMS.md` dosyasındaki eksiklikler için bir **GitHub Issue** oluşturulmuş.
*   Geliştirmeler `phase-1` dalında tamamlanmış ve Issue, ilgili **Pull Request** ile kapatılmıştır.

