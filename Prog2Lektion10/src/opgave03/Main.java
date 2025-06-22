package opgave03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RecentlyUsed recentlyUsed = new RecentlyUsed();

        recentlyUsed.add("apple");
        recentlyUsed.add("banana");
        recentlyUsed.add("orange");
        recentlyUsed.add("banana"); // banana should move to front
        recentlyUsed.add("grape");
        recentlyUsed.add("pear");   // this will push out the oldest entry

        System.out.println("Recently used after adds:");
        System.out.println(Arrays.toString(recentlyUsed.getRecentlyUsed()));

        String removed = recentlyUsed.remove(2);  // remove element at index 2
        System.out.println("Removed: " + removed);

        System.out.println("Recently used after removal:");
        System.out.println(Arrays.toString(recentlyUsed.getRecentlyUsed()));
    }
}
