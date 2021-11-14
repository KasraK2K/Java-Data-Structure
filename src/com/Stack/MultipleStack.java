package com.Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MultipleStack {
    private final int middle;
    private final int[] items;
    private int count1;
    private int count2;

    public MultipleStack(int size) {
        if (size % 2 != 0) throw new IllegalArgumentException("Size must be even");

        middle = count2 = size / 2;
        items = new int[size];
    }

    public void push1(int item) {
        if (isFull1()) throw new StackOverflowError("Stack 1 is full");
        else items[count1++] = item;
    }

    public void push2(int item) {
        if (isFull2()) throw new StackOverflowError("Stack 2 is full");
        else items[count2++] = item;
    }

    public int pop1() {
        if (isEmpty1()) throw new StackOverflowError("Stack 1 is empty");
        return items[--count1];
    }

    public int pop2() {
        if (isEmpty2()) throw new StackOverflowError("Stack 2 is empty");
        return items[--count2];
    }

    public int peek1() {
        if (isEmpty1()) throw new StackOverflowError("Stack 1 is empty");
        return items[count1 - 1];
    }

    public int peek2() {
        if (isEmpty2()) throw new IllegalArgumentException("Stack 2 is empty");

        return items[count2 - 1];
    }

    public boolean isFull1() {
        return count1 == middle;
    }

    public boolean isFull2() {
        return count2 == items.length;
    }

    public boolean isEmpty1() {
        return count1 == 0;
    }

    public boolean isEmpty2() {
        return count2 == middle;
    }

    public int min() {
        int[] contents = new int[count1 + (count2 - middle)];
        System.arraycopy(items, 0, contents, 0, count1);
        System.arraycopy(items, middle, contents, count1, (count2 - middle));

        if (contents.length == 0) throw new EmptyStackException();

        int minimum = contents[0];
        for (int content : contents) if (content < minimum) minimum = content;
        return minimum;
    }

    @Override
    public String toString() {
        int[] content1 = Arrays.copyOfRange(items, 0, count1);
        int[] content2 = Arrays.copyOfRange(items, middle, count2);
        return "Stack 1: " + Arrays.toString(content1) + "\nStack 2: " + Arrays.toString(content2);
    }
}
