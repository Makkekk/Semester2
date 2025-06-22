package opgave01;

import opgave01.models.ListEaaa;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements ListEaaa<E> {
    private Node<E> head;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    @Override
    public void add(E e) {
        if (head == null) {
            head = new Node<>(e);
        } else {
            Node<E> current = head;
            while (current.next != null)
                current = current.next;
            current.next = new Node<>(e);
        }
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
    }

    @Override
    public boolean remove(E e) {
        if (head == null) return false;

        if (head.data.equals(e)) {
            head = head.next;
            size--;
            return true;
        }

        Node<E> current = head;
        while (current.next != null && !current.next.data.equals(e))
            current = current.next;

        if (current.next != null) {
            current.next = current.next.next;
            size--;
            return true;
        }

        return false;
    }

    @Override
    public E getFirst() {
        if (head == null) throw new NoSuchElementException();
        return head.data;
    }

    @Override
    public void removeFirst() {
        if (head == null) throw new NoSuchElementException();
        head = head.next;
        size--;
    }

    @Override
    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.data.equals(e)) return true;
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

    // ✅ Rekursiv hjælpemetode
    private E getRecursive(Node<E> node, int index) {
        if (index == 0) return node.data;
        return getRecursive(node.next, index - 1);
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return getRecursive(head, index);
    }

    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        if (index == 0) {
            addFirst(e);
            return;
        }

        Node<E> current = head;
        for (int i = 0; i < index - 1; i++)
            current = current.next;

        Node<E> newNode = new Node<>(e);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        if (index == 0) {
            E data = head.data;
            head = head.next;
            size--;
            return data;
        }

        Node<E> current = head;
        for (int i = 0; i < index - 1; i++)
            current = current.next;

        E data = current.next.data;
        current.next = current.next.next;
        size--;
        return data;
    }

    @Override
    public int indexOf(E e) {
        Node<E> current = head;
        int i = 0;
        while (current != null) {
            if (current.data.equals(e)) return i;
            current = current.next;
            i++;
        }
        return -1;
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
                if (!hasNext()) throw new NoSuchElementException();
                E data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}