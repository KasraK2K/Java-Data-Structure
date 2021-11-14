package com.Stack;

import java.util.Arrays;

public class Stack {
    private final boolean fixedSize;
    private int[] items = new int[5];
    private int count;

    public Stack(boolean fixedSize) {
        //region If fixedSize is true, then the stack will be fixed size
        this.fixedSize = fixedSize;
        //endregion
    }

    public void push(int item) {
        checkExtend();
        items[count++] = item;
    }

    public int pop() {
        if (isEmpty()) throw new IllegalArgumentException();

        return items[--count];
    }

    public int peek() {
        if (isEmpty()) throw new IllegalArgumentException();

        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        int[] content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

    private void checkExtend() {
        //region Extend items size if it's full size
        if (count == items.length) {
            if (fixedSize)
                throw new StackOverflowError();
            else {
                int[] newItems = new int[items.length * 2];
                System.arraycopy(items, 0, newItems, 0, items.length);
                items = newItems;
            }
        }
        //endregion
    }
}
