# DESIGN PATTERN OBSERVATIONS (FAZ 0)

## 1. Factory Pattern ihtiyacı
Object creation işlemi if-else yapısı ile yönetiliyor. Bu yapı ileride genişletmeyi zorlaştırır.

## 2. Polymorphism ihtiyacı
Farklı nesneler aynı davranışı farklı şekilde gerçekleştirecek şekilde tasarlanmamış.

## 3. Open/Closed Principle problemi
Yeni bir obje türü eklemek için mevcut kodun değiştirilmesi gerekiyor.