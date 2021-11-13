package com.LinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(20);
        list.addLast(30);
        list.addFirst(10);
        list.addLast(40);
        list.addLast(50);

        System.out.println(list.getKthFromTheEnd(1));

        list.reverse();

        int[] array = list.toArray();
        System.out.println(Arrays.toString(array));

        list.removeFirst();
        list.removeLast();

        System.out.println(list.indexOf(30));
        System.out.println(list.contains(30));
        System.out.println(list.size());

        list.printMiddle();
    }

}
