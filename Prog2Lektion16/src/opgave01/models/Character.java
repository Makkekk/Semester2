package opgave01.models;

public abstract class Character {
    protected WeaponBehavior weapon;


    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        if(weapon != null) {
            weapon.useWeapon();
        } else {
            System.out.println("No weapon set for this character.");
        }
    }

}
