package opgave02;

import opgave02.models.SortedListEaaa;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SortedLinkedList<E extends Comparable<E>> implements SortedListEaaa<E> {

    private Node<E> head;
    private int size;

    private static class Node<E> {
        E element;
        Node<E> next;

        Node(E element) {
            this.element = element;
        }
    }

    public SortedLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public void add(E e) {
        if (e == null) throw new NullPointerException();

        Node<E> newNode = new Node<>(e);

        if (head == null || e.compareTo(head.element) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null && current.next.element.compareTo(e) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    @Override
    public boolean remove(E e) {
        if (head == null) return false;

        if (head.element.equals(e)) {
            head = head.next;
            size--;
            return true;
        }

        Node<E> current = head;
        while (current.next != null && !current.next.element.equals(e)) {
            current = current.next;
        }

        if (current.next == null) return false;

        current.next = current.next.next;
        size--;
        return true;
    }

    @Override
    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e)) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E getFirst() {
        if (head == null) throw new NoSuchElementException();
        return head.element;
    }

    @Override
    public void removeFirst() {
        if (head == null) throw new NoSuchElementException();
        head = head.next;
        size--;
    }

    @Override
    public E getLast() {
        if (head == null) throw new NoSuchElementException();
        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public void removeLast() {
        if (head == null) throw new NoSuchElementException();
        if (head.next == null) {
            head = null;
        } else {
            Node<E> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (current == null) throw new NoSuchElementException();
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        // To iterate descending, we can collect elements in a stack or list and then iterate backwards.
        // Simple approach:
        return new Iterator<>() {
            private final Object[] elements;
            private int index;

            {
                // Collect all elements
                elements = new Object[size];
                Node<E> current = head;
                int i = 0;
                while (current != null) {
                    elements[i++] = current.element;
                    current = current.next;
                }
                index = size - 1;
            }

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @SuppressWarnings("unchecked")
            @Override
            public E next() {
                if (index < 0) throw new NoSuchElementException();
                return (E) elements[index--];
            }
        };
    }
}