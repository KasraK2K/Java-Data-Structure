package com.LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }

        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var secoond = first.next;
            first.next = null;
            first = secoond;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }

        size--;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        int index = 0;
        var current = first;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        if (isEmpty()) return;
        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (isEmpty() || k < 1)
            throw new IllegalArgumentException();

        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException();
        }

        while (b != last) {
            a = a.next;
            b = b.next;
        }

        return a.value;
    }

    public void printMiddle() {
        if (isEmpty()) throw new NoSuchElementException();

        Node a = first;
        Node b = first;
        while (b != last && b.next != last) {
            a = a.next;
            b = b.next;
            if (b != last) b = b.next;
            if (b == last) {
                System.out.println("Middle element is: " + a.value);
                return;
            }
        }
        System.out.println("Middle element is: " + a.value + " and " + a.next.value);
    }

    private boolean isEmpty() {
        return first == null;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current.next != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }
}
