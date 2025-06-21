package Opgave1.Models;

import java.util.ArrayList;


public abstract class Warrior extends Character{
    ArrayList<Weapon> weapons = new ArrayList<>();


    public Warrior(String name, int level) {
        super(name, level);
       this.weapons = new ArrayList<>();
    }


    public void addWeapon(Weapon weapon) {
        if (!weapons.contains(weapon)) {
            weapons.add(weapon);
        }
    }
    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }


}
