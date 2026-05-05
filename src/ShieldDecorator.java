public class ShieldDecorator extends GameObjectDecorator {
    public ShieldDecorator(GameObject object) {
        super(object);
    }

    @Override
    public void update() {
        super.update(); 
        addShieldEffect(); 
    }

    private void addShieldEffect() {
        System.out.println("Shield Status: [ACTIVE] - Damage is being absorbed.");
    }
}