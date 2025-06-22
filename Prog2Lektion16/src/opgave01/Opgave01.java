package opgave01;

import opgave01.models.*;
import opgave01.models.Character;

public class Opgave01 {
    public static void main(String[] args) {
        Character king = new King();
        king.setWeapon(new SwordBehavior());
        king.fight();  // Output: "Swinging a sword!"

        Character queen = new Queen();
        queen.setWeapon(new BowAndArrowBehavior());
        queen.fight(); // Output: "Shooting an arrow with a bow!"

        Character troll = new Troll();
        troll.setWeapon(new KnifeBehavior());
        troll.fight(); // Output: "Stabbing with a knife!"

        // Changing weapon dynamically
        troll.setWeapon(new SwordBehavior());
        troll.fight(); // Output: "Swinging a sword!"
    }
}