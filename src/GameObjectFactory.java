public class GameObjectFactory {

    public static GameObject create(String type, int x, int y) {

        switch (type) {
            case "player":
                return new Player(x, y);

            case "enemy":
                return new Enemy(x, y);

            case "item":
                return new Item(x, y);

            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}