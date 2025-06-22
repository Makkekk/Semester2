package opgave03.models;

import opgave01.models.StackEaaa;
import java.util.NoSuchElementException;

public class DropOutStack<E> implements StackEaaa<E> {

    private Node<E> top;        // øverste element (senest tilføjet)
    private Node<E> bottom;     // nederste element (ældst tilføjet)
    private int maxSize;
    private int size;

    public DropOutStack(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
    }

    @Override
    public void push(E element) {
        Node<E> newNode = new Node<>(element);

        if (isEmpty()) {
            top = bottom = newNode;
        } else {
            newNode.previous = top;
            top.next = newNode;
            top = newNode;

            if (size == maxSize) {
                // Drop det nederste (ældste) element
                bottom = bottom.next;
                bottom.previous = null;
            } else {
                size++;
            }
        }

        if (size == 0) size = 1;  // hvis vi var tomme før, sæt size korrekt
    }

    @Override
    public E pop() {
        throwIfEmpty();
        E value = top.element;

        if (top == bottom) { // kun ét element
            top = bottom = null;
        } else {
            top = top.previous;
            top.next = null;
        }

        size--;
        return value;
    }

    @Override
    public E peek() {
        throwIfEmpty();
        return top.element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        top = bottom = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void throwIfEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
    }

    private static class Node<T> {
        T element;
        Node<T> next;
        Node<T> previous;

        Node(T element) {
            this.element = element;
        }
    }
}
