public class Item extends GameObject {

    public Item(int x, int y) {
        super(x, y);
    }

    @Override
    public void update() {
        System.out.println("Item bekliyor");
    }
}