package Opgave1;

import Opgave1.Storage.Storage;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        Kvadrat kv = new Kvadrat(0, 0, 4);
        Rektangel rekt = new Rektangel(1, 1, 3, 5);
        Cirkel cir = new Cirkel(2, 2, 3);
        Ellipse ell = new Ellipse(3, 3, 2, 4);

        storage.addFigur(kv);
        storage.addFigur(rekt);
        storage.addFigur(cir);
        storage.addFigur(ell);


        System.out.println(kv);
        System.out.println(rekt);
        System.out.println(cir);
        System.out.println(ell);

        // Move all figures
        kv.move(1, 1);
        rekt.move(-1, -1);
        cir.move(0.5, 0.5);
        ell.move(2, 2);

        System.out.println("All figures:");
        storage.printAllFigures();

        // Move a figure and print again
        kv.move(5, 5);
        System.out.println("\nAfter moving the square:");
        storage.printAllFigures();
    }
}

