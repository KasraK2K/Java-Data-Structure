package com.Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List<Character> leftBrackets = Arrays.asList('(', '{', '[', '<');
    private final List<Character> rightBrackets = Arrays.asList(')', '}', ']', '>');

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<Character>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) stack.push(ch);
            else if (isRightBracket(ch)) {
                if (stack.isEmpty()) return false;
                if (!bracketMatch(stack.pop(), ch)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean bracketMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
