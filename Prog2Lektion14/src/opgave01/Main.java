package opgave01;

import opgave01.models.ListEaaa;

public class Main {
    public static void main(String[] args) {
        ListEaaa<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.addFirst("X");
        list.add(2, "Y");  // [X, A, Y, B]

        System.out.println("Index 2 (rekursiv get): " + list.get(2)); // "Y"

        for (String s : list) {
            System.out.println(s);  // X, A, Y, B
        }

        list.remove("A");
        list.removeFirst();
        System.out.println("After removals:");
        for (String s : list) {
            System.out.println(s);  // Y, B
        }

        System.out.println("Contains 'B'? " + list.contains("B")); // true
        System.out.println("Index of 'B': " + list.indexOf("B")); // 1
    }
}
