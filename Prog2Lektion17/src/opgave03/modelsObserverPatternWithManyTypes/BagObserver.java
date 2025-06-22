package opgave03.modelsObserverPatternWithManyTypes;

    public interface BagObserver<E> {
        void elementAdded(E element, int newCount);
        void elementRemoved(E element, int newCount);
    }