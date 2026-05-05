public class Main {
    public static void main(String[] args) {

        GameObject player = GameObjectFactory.create("player", 10, 20);
        GameObject enemy = GameObjectFactory.create("enemy", 5, 15);
        GameObject item = GameObjectFactory.create("item", 8, 8);

        player.update();
        enemy.update();
        item.update();
    }
}