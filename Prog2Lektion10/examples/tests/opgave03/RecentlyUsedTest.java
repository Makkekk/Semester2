package opgave03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class RecentlyUsedTest {

    private RecentlyUsed recentlyUsed;

    @BeforeEach
    public void setUp() {
        recentlyUsed = new RecentlyUsed();
    }

    @Test
    public void testInitialListIsEmptyStrings() {
        String[] expected = {"", "", "", "", ""};
        assertArrayEquals(expected, recentlyUsed.getRecentlyUsed());
    }

    @Test
    public void testAddNewElements() {
        recentlyUsed.add("apple");
        recentlyUsed.add("banana");
        String[] expected = {"banana", "apple", "", "", ""};
        assertArrayEquals(expected, recentlyUsed.getRecentlyUsed());
    }

    @Test
    public void testAddExistingMovesToFront() {
        recentlyUsed.add("apple");
        recentlyUsed.add("banana");
        recentlyUsed.add("apple"); // apple should move to front

        String[] expected = {"apple", "banana", "", "", ""};
        assertArrayEquals(expected, recentlyUsed.getRecentlyUsed());
    }

    @Test
    public void testAddMoreThanCapacity() {
        recentlyUsed.add("a");
        recentlyUsed.add("b");
        recentlyUsed.add("c");
        recentlyUsed.add("d");
        recentlyUsed.add("e");
        recentlyUsed.add("f");  // 'f' pushes out the oldest ('a')

        String[] expected = {"f", "e", "d", "c", "b"};
        assertArrayEquals(expected, recentlyUsed.getRecentlyUsed());
    }

    @Test
    public void testRemoveElement() {
        recentlyUsed.add("apple");
        recentlyUsed.add("banana");
        recentlyUsed.add("cherry");

        String removed = recentlyUsed.remove(1); // remove "banana"

        assertEquals("banana", removed);

        String[] expected = {"cherry", "apple", "", "", ""};
        assertArrayEquals(expected, recentlyUsed.getRecentlyUsed());
    }

    @Test
    public void testRemoveInvalidIndex() {
        assertThrows(IllegalArgumentException.class, () -> recentlyUsed.remove(-1));
        assertThrows(IllegalArgumentException.class, () -> recentlyUsed.remove(5));
    }
}