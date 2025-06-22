import opgave01.LinkedList;
import opgave01.models.ListEaaa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    private ListEaaa<String> list;

    @BeforeEach
    void setUp() {
        list = new LinkedList<>();
    }

    @Test
    void testAddAndGet() {
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));
    }

    @Test
    void testAddFirst() {
        list.add("B");
        list.addFirst("A");

        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
    }

    @Test
    void testRemove() {
        list.add("A");
        list.add("B");
        list.add("C");

        assertTrue(list.remove("B"));
        assertEquals(2, list.size());
        assertEquals("C", list.get(1));
    }

    @Test
    void testRemoveByIndex() {
        list.add("A");
        list.add("B");
        list.add("C");

        String removed = list.remove(1);
        assertEquals("B", removed);
        assertEquals("C", list.get(1));
    }

    @Test
    void testClearAndIsEmpty() {
        list.add("A");
        list.add("B");
        list.clear();

        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void testContains() {
        list.add("X");
        list.add("Y");

        assertTrue(list.contains("X"));
        assertFalse(list.contains("Z"));
    }

    @Test
    void testGetFirstAndRemoveFirst() {
        list.add("A");
        list.add("B");

        assertEquals("A", list.getFirst());

        list.removeFirst();
        assertEquals("B", list.getFirst());
    }

    @Test
    void testAddAtIndex() {
        list.add("A");
        list.add("C");
        list.add(1, "B");

        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));
    }

    @Test
    void testIndexOf() {
        list.add("One");
        list.add("Two");
        list.add("Three");

        assertEquals(1, list.indexOf("Two"));
        assertEquals(-1, list.indexOf("Four"));
    }
}