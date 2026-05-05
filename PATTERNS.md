# 🏗 Design Patterns Documentation

## 🚀 Phase 1: Factory Method Pattern

### 🔍 Where used (Nerede Kullanıldı?)
`GameObject` üretimi, `Main` sınıfı içerisinden tamamen temizlendi ve bu sorumluluk `GameObjectFactory` sınıfına devredildi. İstemci (`Main`), artık somut sınıflar (`Player`, `Enemy`, `Item`) yerine sadece fabrika arayüzü ile etkileşime geçiyor.

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