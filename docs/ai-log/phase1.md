# 🤖 AI Log - Phase 1: Creational Patterns

# 📝 Prompt Used (Yapay Zekaya Sorulan Soru)
>"Mini oyun motoru projemde nesne oluşturma mantığı (Player, Enemy, Item) şu an doğrudan Main sınıfı içerisinde if-else blokları ve new anahtar kelimesiyle yapılıyor. Bu durum Open/Closed Principle (Açık/Kapalı Prensibi) açısından ne gibi sorunlar yaratır? Hangi nesne oluşturma örüntüsü bu bağımlılığı (coupling) azaltabilir ve nesne üretimini tek bir merkezden yönetmemi sağlar?"
# ⚙️ AI Response Summary (AI Ne Önerdi?)
Yapay zeka, nesne üretim sürecindeki sorunları tespit ederek şu çözümleri sundu:

Factory Method Pattern: Nesne oluşturma sorumluluğunu istemci sınıftan (Main) alıp özel bir fabrikaya devretmek için bu örüntüyü önerdi.
Abstraktsiyon: İstemcinin somut sınıflara (Concrete Classes) değil, soyut GameObject sınıfına bağımlı olması gerektiğini belirtti.
Esneklik: Yeni bir düşman veya eşya tipi eklendiğinde Main kodunun değişmesine gerek kalmadan sistemin genişletilebileceğini vurguladı.
# 🛠️ My Implementation (Neyi, Nasıl Uyguladım?)
AI'nın önerilerini temel alarak şu yapısal değişikliği gerçekleştirdim:

Factory Uygulaması: GameObjectFactory adında merkezi bir sınıf oluşturdum. Main sınıfı artık hangi nesnenin nasıl üretileceğini bilmiyor; sadece factory'den bir "tip" istiyor.
Gevşek Bağlılık (Loose Coupling): Projenin başlangıcındaki if (type == "player") gibi mantıksal kontrolleri Main içerisinden tamamen temizledim. Artık tüm üretim GameObjectFactory.createGameObject() metodu üzerinden polimorfik olarak dönüyor.
# ⚠️ AI Audit: Critical Logic Corrections (AI'ın Yanlış/Eksik Önerileri)
Yapay zekanın sunduğu önerilerde fark ettiğim ve düzelttiğim kritik noktalar:

Karmaşıklık Kontrolü: AI başlangıçta her nesne tipi için ayrı bir Factory sınıfı (Abstract Factory'ye yakın) önerdi. Ancak projenin bu aşamasında bunun "Over-engineering" (gereksiz karmaşıklık) olacağını fark ederek Simple Factory yaklaşımını tercih ettim.
Statik Metod Kullanımı: AI, fabrikayı sürekli new ile oluşturmamı öneriyordu. Bellek yönetimini optimize etmek ve her seferinde fabrika nesnesi üretmemek için üretim metodunu static olarak güncelledim.
Hata Yönetimi Eksikliği: AI'ın kod taslağında geçersiz bir tip girildiğinde (null dönmesi gibi) bir kontrol yoktu. Ben sisteme IllegalArgumentException fırlatan bir hata yakalama mekanizması ekledim.
# ⚖️ Alternatives & Decisions (Alternatifler ve Kararlar)
Neden Factory? Nesne oluşturma mantığı tek bir merkezde toplandığı için kodun bakımı kolaylaştı. Yarın "Boss" adında yeni bir sınıf eklediğimde sadece fabrikayı güncellemem yetecek.
Neden Singleton Reddedildi? AI başlangıçta fabrikanın bir Singleton olması gerektiğini de çıtlattı; ancak şu aşamada global bir erişim noktasına ihtiyacım olmadığı ve static factory yöntemi daha temiz bir çözüm sunduğu için bu karmaşıklıktan kaçındım.