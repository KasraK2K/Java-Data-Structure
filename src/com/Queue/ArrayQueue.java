package com.Queue;

import java.util.Arrays;

public class ArrayQueue {
    private final int[] items;
    private int count;
    private int front;
    private int rear;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (isFull()) throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) throw new IllegalStateException();

        int item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    private boolean isFull() {
        return count == items.length;
    }

    private boolean isEmpty() {
        return count == 0;
    }
}
