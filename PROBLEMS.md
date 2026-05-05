# PROBLEMS ANALYSIS (FAZ 0)

## 1. Type checking with if-else
Kod içinde nesne türü string ile kontrol ediliyor. Bu yapı hataya açıktır ve ölçeklenebilir değildir.

## 2. Single Responsibility Principle violation
GameObject sınıfı hem veri tutuyor hem de davranış kontrolü yapıyor.

## 3. Open/Closed Principle violation
Yeni bir nesne türü eklemek için mevcut kodun değiştirilmesi gerekiyor.

## 4. String dependency problem
Type bilgisi string ile tutulduğu için yazım hatalarına açıktır.

## 5. Low extensibility
Yeni obje türleri eklemek zor ve mevcut yapıyı bozuyor.

---

## AI Prompt Used

"Bu kodda hangi tasarım sorunlarını görüyorsun? Hangi tasarım örüntüleri bu sorunları çözebilir? Her sorun için kısa bir açıklama yaz."

---

## AI Analysis

AI bu kodda şu sorunları tespit etti:
- if-else ile type kontrolü yapılması
- polymorphism eksikliği
- Factory Pattern ihtiyacı
- Open/Closed Principle ihlali
- düşük extensibility

AI ayrıca şu tasarım örüntülerini önerdi:
- Factory Method Pattern
- Polymorphism kullanımı

---

## Comparison (AI vs Me)

Benim tespitlerim:
- if-else yapısının kullanılması
- string tabanlı type kontrolü
- kodun genişletilememesi

AI’ın ek olarak gördükleri:
- Factory Pattern ihtiyacı
- polymorphism eksikliği
- OCP ihlali

---

## Result

AI daha geniş ve tasarım odaklı bir bakış sundu.  
Ben ise daha çok kod içi yapısal problemleri fark ettim.