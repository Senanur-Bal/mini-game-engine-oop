public class Player extends GameObject {

    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public void update() {
        System.out.println("Player hareket ediyor");
    }
}