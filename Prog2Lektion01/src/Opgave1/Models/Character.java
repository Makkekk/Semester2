package Opgave1.Models;

public abstract class Character {
    String name;
    int level;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
