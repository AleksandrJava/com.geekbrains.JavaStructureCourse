package Lesson3;

import java.util.NoSuchElementException;

public class PostfixExpr {
    private String expr;

    public PostfixExpr(String expr) {
        this.expr = expr;
    }

    public int calculate() {
        MyArrayStack<Integer> stack = new MyArrayStack<>();
        String[] s = expr.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("+") || s[i].equals("*") || s[i].equals("/") || s[i].equals("-")) {
                if (stack.getSize() < 2) {
                    throw new NoSuchElementException();
                }
                int a = stack.pop();
                int b = stack.pop();
                if (s[i].equals("+")) {
                    stack.push(a + b);
                } else if (s[i].equals("-")) {
                    stack.push(b - a);
                } else if (s[i].equals("*")) {
                    stack.push(a * b);
                } else {
                    stack.push(b / a);
                }
            }
            else {
                stack.push(Integer.parseInt(s[i]));
            }
        }
        if (stack.getSize() != 1) {
            throw new NoSuchElementException();
        }
        return stack.peek();
    }
}
