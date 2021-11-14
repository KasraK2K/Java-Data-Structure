package com.Stack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //        String str = "((2 + 4) + (9 + 6 ))";

        //        StringReverser reverser = new StringReverser();
        //        String result = reverser.reverse(str);
        //        System.out.println(result);

        //        Expression exp = new Expression();
        //        Boolean result = exp.isBalanced(str);
        //        System.out.println(result);

        //        Stack stack = new Stack(false);
        //        stack.push(1);
        //        stack.push(2);
        //        stack.push(3);
        //        stack.push(4);
        //        stack.push(5);
        //        stack.push(6);
        //        stack.pop();
        //        System.out.println(stack.peek());
        //        System.out.println(stack.toString());
        //        System.out.println(stack.isEmpty());

        MultipleStack multipleStack = new MultipleStack(4);
        multipleStack.push1(10);
        multipleStack.push1(22);
        multipleStack.push2(2);
        multipleStack.push2(4);
        multipleStack.pop1();
        System.out.println("isEmpty: " + multipleStack.isEmpty1());
        System.out.println("toString: \n" + multipleStack.toString());
        System.out.println("peek1: " + multipleStack.peek1());
        System.out.println("min: " + multipleStack.min());
    }
}
