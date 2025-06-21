package Opgave1.Models;


public class Spell {
    private String name;
    private int range;
    private Duration duration ;

    public Spell(String name, int range, Duration duration) {
        this.name = name;
        this.range = range;
        this.duration = duration;

    }

    public String getName() {
        return name;
    }

    public int getRange() {
        return range;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
