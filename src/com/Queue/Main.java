package com.Queue;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        //        queue.dequeue();
        //        queue.dequeue();
        //        queue.dequeue();
        //        queue.dequeue();

        System.out.println(queue.toString());
    }
}
