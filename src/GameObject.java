public class GameObject {
    public String type;
    public int x;
    public int y;

    public GameObject(String type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public void update() {
        if (type.equals("player")) {
            System.out.println("Player hareket ediyor");
        } else if (type.equals("enemy")) {
            System.out.println("Enemy saldırıyor");
        } else if (type.equals("item")) {
            System.out.println("Item bekliyor");
        }
    }
}