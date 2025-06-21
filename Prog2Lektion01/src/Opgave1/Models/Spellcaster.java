package Opgave1.Models;

import java.util.ArrayList;

public abstract class Spellcaster extends Character {
    ArrayList<Spell> spells = new ArrayList<>();

    public Spellcaster(String name, int level) {
        super(name, level);
        this.spells = new ArrayList<>();

    }

    public Spellcaster(String name, int level, ArrayList<Spell> spells) {
        super(name, level);
    }

    public void addSpell(Spell spell) {
        if (!spells.contains(spell)) {
            spells.add(spell);

        }
    }
}
