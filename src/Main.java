public class Main {
    public static void main(String[] args) {

        GameObject g1 = new GameObject("player", 10, 20);
        GameObject g2 = new GameObject("enemy", 5, 15);
        GameObject g3 = new GameObject("item", 8, 8);

        g1.update();
        g2.update();
        g3.update();
    }
}