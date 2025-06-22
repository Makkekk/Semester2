package opgave01.models;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

    public class ArrayListStack<E> implements StackEaaa<E> {
        private final List<E> elements = new ArrayList<>();

        @Override
        public void push(E element) {
            elements.add(element);
        }

        @Override
        public E pop() {
            throwIfEmpty();
            return elements.remove(elements.size() - 1);
        }

        @Override
        public E peek() {
            throwIfEmpty();
            return elements.get(elements.size() - 1);
        }

        @Override
        public boolean isEmpty() {
            return elements.isEmpty();
        }

        @Override
        public void clear() {
            elements.clear();
        }

        @Override
        public int size() {
            return elements.size();
        }

        private void throwIfEmpty() {
            if (elements.isEmpty()) {
                throw new NoSuchElementException("Stack is empty");
            }
        }
    }

