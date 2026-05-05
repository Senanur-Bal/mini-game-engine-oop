## Factory Method Pattern (Phase 1)

### Where used
GameObject creation is handled by GameObjectFactory.

### Why used
To remove if-else logic and centralize object creation.

<<<<<<< Updated upstream
### Benefit
- Cleaner Main class
- Easier to extend new object types
- Better OOP structure
=======
### ❓ Why used (Neden Kullanıldı?)
*   **Tight Coupling'i (Sıkı Bağlılık) Önlemek:** `Main` sınıfının tüm alt sınıfları tanıması bağımlılığı artırıyordu. Fabrika kullanarak bu bağları kopardık.
*   **Karmaşık Mantığı Soyutlamak:** Nesne oluşturma sırasındaki `switch-case` yapısını tek bir merkezde toplayarak kod tekrarını önledik.
*   **Open/Closed Principle:** Sisteme yeni bir nesne türü (örn: `NPC`) eklendiğinde mevcut `Main` koduna dokunmadan sadece fabrikayı genişletmeyi mümkün kıldık.

### 🏆 Benefit (Ne Kazandınız?)
*   **Clean Code:** `Main` sınıfı sadece oyunun akışına odaklandı, nesne yaratma yükünden kurtuldu.
*   **Maintainability:** Bir nesnenin oluşturulma şekli değişirse (örn: yeni bir constructor parametresi gelirse), sadece `GameObjectFactory` sınıfını güncellemek yeterli olacak.
*   **Polimorfizm:** Tüm nesneler `GameObject` tipiyle yönetildiği için kod daha esnek ve tip güvenli hale geldi.

---

## 📊 UML Class Diagrams

### 🔴 Phase 0: Before (Tight Coupling - Hatalı Tasarım)
Bu aşamada tasarım sorunluydu; `Main` sınıfı her somut sınıfa doğrudan bağlıydı ve kodun genişletilmesi zordu.

```text
       +-----------------------+
       |         Main          |
       +-----------------------+
       | + main()              | 
       +-----------------------+
           |          |          |
           | (Direct) | (Direct) | (Direct)
           v          v          v
    +--------+   +-------+   +------+
    | Player |   | Enemy |   | Item |
    +--------+   +-------+   +------+
```

🟢 Phase 1: After (Factory Method - İyileştirilmiş Tasarım)
Fabrika katmanı sayesinde bağımlılıklar soyutlandı. Main artık sadece GameObject ve GameObjectFactory sınıflarını tanıyor.

```text
+-----------------------+
       |      GameObject       |  <---- (Abstract Class)
       +-----------------------+
       | # x: int              |
       | # y: int              |
       +-----------------------+
       | + update(): void      |
       +-----------------------+
                   ^
                   | (Inheritance)
      +------------+------------+
      |            |            |
+----------+  +---------+  +---------+
|  Player  |  |  Enemy  |  |  Item   |
+----------+  +---------+  +---------+
| +update()|  | +update()|  | +update()|
+----------+  +---------+  +---------+
      ^            ^            ^
      |            |            |
      +------------+------------+
                   |
         (Instantiates objects)
                   |
      +-------------------------+
      |    GameObjectFactory    |
      +-------------------------+
      | + create(type, x, y)    |
      +-------------------------+
                   |
              (Called by)
                   |
             +-----------+
             |   Main    |
             +-----------+
```

Harika, elindeki PATTERNS.md dosyası oldukça düzenli ve ASCII diyagramlarıyla detaylandırılmış. Faz 2 dökümantasyonunu bu yapıya birebir uydurarak eklemelisin.

Aşağıdaki metni, dosyanın sonuna (Phase 1'in bittiği yerden itibaren) ekleyebilirsin. ASCII diyagramlarını senin mevcut stiline göre hazırladım:

🛠 Phase 2: Structural Patterns
🔍 Where used (Nerede Kullanıldı?)
Decorator Pattern: GameObject nesnelerine (Player/Enemy) çalışma anında dinamik özellikler eklemek için GameObjectDecorator ve ShieldDecorator sınıfları sisteme dahil edildi.

Adapter Pattern: Uyumsuz bir arayüze sahip olan LegacyLogger kütüphanesini, oyunun standart update() döngüsüne sokabilmek için LoggerAdapter sınıfı kullanıldı.

❓ Why used (Neden Kullanıldı?)
Sınıf Patlamasını (Class Explosion) Önlemek: Kalkan, Hız gibi her özellik kombinasyonu için ayrı alt sınıf (ShieldedPlayer, FastEnemy) açmak yerine, Decorator ile özellikleri üst üste eklemeyi sağladık.

Arayüz Uyumluluğu: Kaynak koduna dokunamadığımız dış kütüphaneleri (Adaptee), mevcut sistemin beklediği arayüze (Target) dönüştürerek polimorfizmi koruduk.

Open/Closed Principle: Mevcut Player veya Enemy kodunda tek bir satır değiştirmeden sisteme yepyeni davranışlar (Loglama, Kalkan) ekledik.

🏆 Benefit (Ne Kazandınız?)
Runtime Flexibility: Nesnelerin özellikleri oyun devam ederken değiştirilebilir hale geldi.

Modularity: Loglama ve Savunma (Kalkan) mantığı ana sınıflardan ayrıştırıldı (Single Responsibility).

Integration: Uyumsuz yapılar sistemle tam uyumlu hale getirilerek kodun genel akışı bozulmadı.

📊 UML Class Diagrams (Phase 2)
🔵 Decorator Pattern Structure

```text
      +-----------------------+
      |      GameObject       | <----+
      +-----------------------+      |
      | + update(): void      |      |
      +-----------------------+      |
          ^              ^           | (Wraps / Decorates)
          |              |           |
    +----------+  +-------------------------+
    |  Player  |  |   GameObjectDecorator   | <--- (Abstract)
    +----------+  +-------------------------+
    | +update()|  | - wrapped: GameObject   |
    +----------+  +-------------------------+
                  | + update(): void        |
                  +-------------------------+
                             ^
                             | (Inheritance)
                  +-------------------------+
                  |     ShieldDecorator     |
                  +-------------------------+
                  | + update(): void        |
                  +-------------------------+
```

🔵 Adapter Pattern Structure
```text
      +-----------------------+          +-----------------------+
      |      GameObject       |          |     LegacyLogger      |
      +-----------------------+          +-----------------------+
      | + update(): void      |          | + logMessage(): void  |
      +-----------------------+          +-----------------------+
                  ^                          ^
                  | (Implements)             | (Called by)
      +-----------------------+              |
      |     LoggerAdapter     |--------------+
      +-----------------------+
      | - logger: LegacyLogger|
      +-----------------------+
      | + update(): void      |  <-- calls logger.logMessage()
      +-----------------------+
```

⚖️ Adapter vs Facade Decision (Karar Notu)
Bu fazda Adapter tercih edilmiştir çünkü hedefimiz karmaşık bir alt sistemi basitleştirmek (Facade) değil, tek bir uyumsuz arayüzü mevcut sistemimizin update() döngüsüne polimorfik olarak uydurmaktır.
>>>>>>> Stashed changes
