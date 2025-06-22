package opgave03;

import java.util.Arrays;

public class RecentlyUsed implements RecentlyUsedList {
    private String[] items = new String[5];


    public RecentlyUsed() {
        Arrays.fill(items, "");
    }

    @Override
    public void add(String element) {
        // check if element already exists
        int existingIndex = -1;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(element)) {
                existingIndex = i;
                break;
            }
        }
        if (existingIndex == 0) {
            // Element is already at the front, no need to move it
            return;
        }
        if (existingIndex > 0) {
            // Element exists but not at the front, move it to the front
            for (int i = existingIndex; i > 0; i--) {
                items[i] = items[i - 1];
            }
            items[0] = element;
        } else {
            // Element does not exist, shift elements and add to front
            for (int i = items.length - 1; i > 0; i--) {
                items[i] = items[i - 1];
            }
            items[0] = element;
        }

    }

    @Override
    public String remove(int index) {
        if (index < 0 || index > 4) {
            throw new IllegalArgumentException("Index must be between 0 and 4 inclusive");
        }
        String removed = items[index];
        // Shift left all elements after index
        for (int i = index; i < items.length - 1; i++) {
            items[i] = items[i + 1];
        }
        // Set last element to empty string
        items[items.length - 1] = "";
        return removed;
    }

    @Override
    public String[] getRecentlyUsed() {
        return Arrays.copyOf(items, items.length);
    }
}

