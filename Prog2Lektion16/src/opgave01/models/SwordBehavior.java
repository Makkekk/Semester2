package opgave01.models;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword!");
    }
}
