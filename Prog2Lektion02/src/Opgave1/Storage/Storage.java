package Opgave1.Storage;
import Opgave1.Figur;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Figur> figures = new ArrayList<>();

    public void addFigur(Figur figur) {
        figures.add(figur);
    }

    public List<Figur> getFigures() {
        return new ArrayList<>(figures);
    }

    public void printAllFigures() {
        for (Figur f : figures) {
            System.out.println(f);
        }
    }
}
