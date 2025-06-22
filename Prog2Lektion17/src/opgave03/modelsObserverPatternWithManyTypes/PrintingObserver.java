package opgave03.modelsObserverPatternWithManyTypes;

public class PrintingObserver<E> implements BagObserver<E> {
    @Override
    public void elementAdded(E element, int newCount) {
        System.out.println("Added: " + element + ", new count: " + newCount);
    }

    @Override
    public void elementRemoved(E element, int newCount) {
        System.out.println("Removed: " + element + ", new count: " + newCount);
    }
}