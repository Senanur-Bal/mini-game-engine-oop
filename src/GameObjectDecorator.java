public abstract class GameObjectDecorator extends GameObject {
    protected GameObject wrappedObject;

    public GameObjectDecorator(GameObject object) {
        // Hangi nesneye özellik ekleyeceksek onu içeri alıyoruz
        this.wrappedObject = object;
    }

    @Override
    public void update() {
        // Önce sarmalanan nesnenin kendi işini yapmasını sağlıyoruz
        wrappedObject.update();
    }
}