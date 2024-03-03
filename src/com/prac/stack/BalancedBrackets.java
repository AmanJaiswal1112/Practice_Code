package com.prac.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String exp = "[(])";                           // "[()]{}{[()()]()}";
        boolean status = isBalance(exp);
        boolean status1 = areBracketsBalanced(exp);
        System.out.println(status);
        System.out.println(status1);
    }

    private static boolean isBalance(String exp) {
        if(exp.length() % 2 != 0){
            return false;
        }
        char[] chars = exp.toCharArray();
        Stack<Character> characterStack = new Stack<>();
        for (char ch: chars) {
            if(ch == '[' || ch == '{' || ch == '('){
                characterStack.push(ch);
            }else if(characterStack.isEmpty()){
                return false;
            }else if ((ch == ']' && characterStack.peek() == '[')
                    || (ch == '}' && characterStack.peek() == '{')
                    || (ch == ')' && characterStack.peek() == '(') )
            {
                characterStack.pop();
            }else{
                return false;
            }
        }
        return characterStack.isEmpty();
    }

    static boolean areBracketsBalanced(String expr)
    {
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
