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

## 📂 Dokümantasyon ve Süreç Rehberi
Proje değerlendirmesi için aşağıdaki dosyalar incelenebilir:

*   **[Mimari Analiz (PATTERNS.md)](./PATTERNS.md):** Uygulanan Factory Method örüntüsünün detayları ve **Önce/Sonra UML Sınıf Diyagramları**.
*   **[Sorun Tespiti (PROBLEMS.md)](./PROBLEMS.md):** Faz 0'da tespit edilen ve bu fazda çözülen tasarımsal problemler.
*   **[Yapay Zeka Kullanım Logu (docs/ai-log/phase1.md)](./docs/ai-log/phase1.md):** AI ile yapılan review süreci ve alınan mimari kararların dökümü.

### 🛠 GitHub İş Akışı
- `PROBLEMS.md` dosyasındaki eksiklikler için bir **GitHub Issue** oluşturulmuş.
- Geliştirmeler `phase-1` dalında tamamlanmış ve Issue, ilgili **Pull Request** ile kapatılmıştır.