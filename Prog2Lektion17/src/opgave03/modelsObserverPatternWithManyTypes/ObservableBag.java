package opgave03.modelsObserverPatternWithManyTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObservableBag<E> implements Bag<E> {
    private Map<E, Integer> elementCounts = new HashMap<>();
    private List<BagObserver<E>> observers = new ArrayList<>();

    public void addObserver(BagObserver<E> observer) {
        observers.add(observer);
    }

    public void removeObserver(BagObserver<E> observer) {
        observers.remove(observer);
    }

    @Override
    public void add(E element) {
        int newCount = elementCounts.getOrDefault(element, 0) + 1;
        elementCounts.put(element, newCount);
        notifyElementAdded(element, newCount);
    }

    @Override
    public void remove(E element) {
        if (!elementCounts.containsKey(element)) return;

        int currentCount = elementCounts.get(element);
        if (currentCount <= 1) {
            elementCounts.remove(element);
            notifyElementRemoved(element, 0);
        } else {
            elementCounts.put(element, currentCount - 1);
            notifyElementRemoved(element, currentCount - 1);
        }
    }

    @Override
    public int getCount(E element) {
        return elementCounts.getOrDefault(element, 0);
    }

    private void notifyElementAdded(E element, int count) {
        for (BagObserver<E> observer : observers) {
            observer.elementAdded(element, count);
        }
    }

    private void notifyElementRemoved(E element, int count) {
        for (BagObserver<E> observer : observers) {
            observer.elementRemoved(element, count);
        }
    }
}