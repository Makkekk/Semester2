package opgave01.models;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using a knife to attack!");
    }
}
