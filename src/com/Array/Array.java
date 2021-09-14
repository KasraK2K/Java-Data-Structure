package com.Array;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void insertAt(int index, int item) {
        if (index < 0 || index > count)
            throw new IllegalArgumentException();
        count++;
        for (int i = count; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index > count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    public int max() {
        int max = 0;
        if (count > 0)
            for (int i = 0; i < count; i++)
                if (items[i] > max)
                    max = items[i];
        return max;
    }

    public Array intersect(Array other) {
        Array intersection = new Array(count);
        for (int item : items)
            if (other.indexOf(item) >= 0)
                intersection.insert(item);
        return intersection;
    }

    public int[] reverse() {
        int[] reversed = new int[count];
        int reverseIndex = 1;
        for (int i = 0; i < count; i++)
            reversed[i] = items[count - reverseIndex++];
        return reversed;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
