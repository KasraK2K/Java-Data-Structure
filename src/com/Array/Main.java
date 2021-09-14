package com.Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Array numbers = new Array(2);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
        numbers.insert(5);
        numbers.insert(6);
        numbers.insertAt(3, 149);
        numbers.removeAt(5);
        System.out.println(numbers.indexOf(4));
        numbers.print();
        System.out.println(numbers.max());

        Array other = new Array(5);
        other.insert(1);
        other.insert(5);
        other.insert(9);
        Array intersection = numbers.intersect(other);
        intersection.print();

        int[] revesedNumbers = numbers.reverse();
        System.out.println(Arrays.toString(revesedNumbers));
    }

}
