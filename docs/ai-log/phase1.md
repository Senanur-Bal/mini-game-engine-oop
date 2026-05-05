# 🤖 AI Log - Phase 1: Creational Patterns

## 📝 Prompt Used (Yapay Zekaya Sorulan Soru)
> "Elimdeki oyun motoru projesinde nesne yaratma (Player, Enemy, Item) işlemleri Main sınıfı içinde switch-case/if-else bloklarıyla yapılıyor. Bu durum kodun genişletilmesini zorlaştırıyor. Bu sorunu çözmek için hangi Creational Design Pattern'ı kullanmalıyım ve bu pattern'ı Java projemde nasıl yapısallaştırabilirim?"

## ⚙️ AI Response Summary (AI Ne Önerdi?)
Yapay zeka, kodun **Tight Coupling** (Sıkı Bağlılık) ve **OCP** (Open/Closed Principle) ihlali barındırdığını teyit etti. Çözüm olarak şunları önerdi:
1.  **Factory Method Pattern** kullanımı: Nesne üretimini `GameObjectFactory` adında merkezi bir sınıfa taşımak.
2.  **Polymorphism:** `GameObject` adında bir abstract sınıf veya interface oluşturarak tüm nesneleri bu çatı altında toplamak.
3.  **Encapsulation:** `Main` sınıfının somut sınıfları (Player, Enemy vb.) tanımasına gerek kalmadan, sadece fabrikadan bir nesne talep etmesini sağlamak.

## 🛠️ My Implementation (Neyi, Nasıl Uyguladım?)
AI'nın önerdiği **Factory Method** yapısını projeye şu şekilde entegre ettim:
*   **GameObject (Abstract):** Tüm oyun nesneleri için ortak bir temel sınıf oluşturdum.
*   **Somut Sınıflar:** `Player`, `Enemy` ve `Item` sınıflarını `GameObject`'ten türettim.
*   **GameObjectFactory:** `createObject(type, x, y)` metoduna sahip merkezi fabrikayı yazdım. `Main` sınıfı artık `new Player()` demek yerine `factory.createObject("PLAYER", x, y)` yapısını kullanıyor.

**Neden bu yolu seçtim?** 
AI'nın önerisi, kodun ileride yeni karakter türleri eklenirken (örneğin NPC veya Boss) mevcut çalışan koda dokunmadan genişletilmesine olanak tanıyordu. Bu, sürdürülebilir bir mimari için en mantıklı çözümdü.