package opgave02.models;

public class ArrayBag<E> implements Bag<E> {
    // the array to hold the items
    private final E[] items;
    // current number of items in the bag,
    // items are at index 0..size-1
    private int size;

    /**
     * Create a bag with the given capacity.
     */
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        E[] empty = (E[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    /**
     * Create a bag with capacity 10.
     */
    public ArrayBag() {
        this(10);
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == items.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E newEntry) {
        if (newEntry == null) {
            return false;
        }
        if (isFull()) {
            return false;
        }
        items[size] = newEntry;
        size++;
        return true;
    }


    @Override
    public E remove() {
        if (isEmpty()) {
            return null; // or throw an exception
        }
        return items[--size]; // return the last item and decrease size
    }

    @Override
    public boolean remove(E anEntry) {
        if (anEntry == null || isEmpty()) {
            return false; // cannot remove null or from an empty bag
        }
        for (int i = 0; i < size; i++) {
            if (items[i].equals(anEntry)) {
                // Shift items to the left to fill the gap
                for (int j = i; j < size - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[--size] = null; // Clear the last item
                return true;
            }
        }
        return false; // item not found
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            items[i] = null; // Clear each item
        }
        size = 0; // Reset size to 0
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int frequency = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] == null && anEntry == null) {
                frequency++;
            } else if (items[i] != null && items[i].equals(anEntry)) {
                frequency++;
            }
        }
        return frequency;
    }

    @Override
    public boolean contains(E anEntry) {
        for (int i = 0; i < size; i++) {
            if (items[i] == null && anEntry == null) {
                return true; // both are null
            } else if (items[i] != null && items[i].equals(anEntry)) {
                return true; // found the entry
            }
        }
        return false;
    }
@SuppressWarnings("unchecked")
    @Override
    public E[] toArray() {
        E[] result = (E[]) new Object[size];
        System.arraycopy(items,0,result,0,size);
        return result;
    }
}