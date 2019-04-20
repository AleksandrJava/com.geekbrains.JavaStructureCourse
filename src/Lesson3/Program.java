package Lesson3;

public class Program {
    public static void main(String[] args) {
        /*
        MyArrayStack<Character> stack = new MyArrayStack<>();
        stack.push('a');
        stack.push('c');
        stack.push('d');
        stack.push('x');
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push('g');
        System.out.println(stack.peek());
        System.out.println(stack);
        */
        /*
        Expression expression = new Expression("(a + 4) * }([b - 7] / {a - 5 * (a - 2)})");
        System.out.println(expression.checkBrackets());
        */
        /*
        MyArrayQueue<Character> queue = new MyArrayQueue<>();
        queue.enqueue('a');
        queue.enqueue('b');
        queue.enqueue('c');
        queue.enqueue('d');
        queue.enqueue('e');
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.size());
        queue.dequeue();
        queue.enqueue('x');
        queue.enqueue('y');
        queue.enqueue('z');
        System.out.println(queue);
        */
        PostfixExpr pe = new PostfixExpr("2 3 + 4 2 - *");
        System.out.println(pe.calculate());
    }
}
