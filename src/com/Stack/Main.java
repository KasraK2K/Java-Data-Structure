package com.Stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = "((2 + 4))";
//
//        StringReverser reverser = new StringReverser();
//        String result = reverser.reverse(str);
//        System.out.println(result);

        Expression exp = new Expression();
        Boolean result = exp.isBalanced(str);
        System.out.println(result);
    }

}
