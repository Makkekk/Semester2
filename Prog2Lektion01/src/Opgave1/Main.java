package Opgave1;

import Opgave1.Models.*;


public class Main {
    public static void main(String[] args) {
        Barbarian barbarian = new Barbarian("Fof-Stelr",10);
        Wizard wizard = new Wizard("Or-lemeax", 20);



        barbarian.addWeapon(new Weapon("Longsword"));
        wizard.addSpell(new Spell("Fireball", 150, Duration.INSTANTANEOUS));
        barbarian.addWeapon(new Ranged("Shortbow", 80));


    }
}
