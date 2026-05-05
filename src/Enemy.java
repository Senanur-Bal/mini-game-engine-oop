public class Enemy extends GameObject {

    public Enemy(int x, int y) {
        super(x, y);
    }

    @Override
    public void update() {
        System.out.println("Enemy saldırıyor");
    }
}