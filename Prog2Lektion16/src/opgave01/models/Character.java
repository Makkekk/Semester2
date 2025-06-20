package opgave01.models;

public abstract class Character {
    protected WeaponBehavior weapon;
    public void fight() {
        weapon.useWeapon();
    }

}
